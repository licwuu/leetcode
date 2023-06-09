package editor.cn;

public class UniquePaths62 {
    public static void main(String[] args) {
        Solution solution = new UniquePaths62()
                .new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int uniquePaths(int m, int n) {
            int[][] dp = new int[m][n];
            dp[0][0] = 1;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if(i == 0 && j ==0) continue;
                    if(i != 0) dp[i][j] += dp[i - 1][j];
                    if(j != 0) dp[i][j] += dp[i][j - 1];
                }
            }
            return dp[m - 1][n - 1];
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}