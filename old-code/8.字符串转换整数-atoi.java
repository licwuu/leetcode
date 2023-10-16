package Java;

/*
 * @lc app=leetcode.cn id=8 lang=java
 *
 * [8] 字符串转换整数 (atoi)
 */

// @lc code=start
class Solution {
    public boolean isNum(char c){
        return c >= '0' && c <='9';
    }
    public int myAtoi(String s) {
        long ans = 0, flag = 1;
        boolean isTrans = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(isTrans == false && c == ' ') continue;//前导空格

            if(isTrans == false && c == '-' ){
                flag = -1;
                isTrans = true;
                continue;
            }
            if(isTrans == false && c == '+' ){
                flag = 1;
                isTrans = true;
                continue;
            }
            if(isNum(c) == false) break;
            isTrans = true;
            ans = ans * 10 + c - '0';
            if(ans * flag >Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(ans * flag < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }
        return (int)(ans * flag);
    }
}
// @lc code=end
