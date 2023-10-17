/*
 * @lc app=leetcode.cn id=2652 lang=java
 *
 * [2652] 倍数求和
 */

// @lc code=start
class Solution {
    public int sumOfMultiples(int n) {
        return f(n, 3) + f(n, 5) + f(n, 7)
        - f(n, 15) - f(n, 3 * 7) - f(n, 5 * 7) 
        + f(n, 3 * 5 * 7);
    }

    private int f(int n, int m) {
        return (m + n - n % m) * (n / m) / 2;
    }
}
// @lc code=end
