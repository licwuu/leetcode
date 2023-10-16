package editor.cn.solution;

class NThTribonacciNumber{
    public static void main(String[] args) {
        Solution solution = new NThTribonacciNumber().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int tribonacci(int n) {
            if(n < 2) return n;
            int[] dp = new int[n + 1];
            dp[0] = 0;
            dp[1] = dp[2] = 1;
            for(int i = 3; i <= n; i++){
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
            return dp[n];
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}