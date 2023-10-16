package editor.cn;

public class NumberOfCommonFactors2427 {
    public static void main(String[] args) {
        Solution solution = new NumberOfCommonFactors2427().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int commonFactors(int a, int b) {
            int res = 0;
            for (int i = 1; i <= a && i <= b; i++) {
                if (a % i == 0 && b % i == 0) res++;
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}