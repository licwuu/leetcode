package Java.剑指offer;

/**
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * 示例:
 * 现有矩阵 matrix 如下：
[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]
 * 给定 target = 5，返回 true。
 * 给定 target = 20，返回 false。
 * 
 * 限制：
 * 0 <= n <= 1000
 * 0 <= m <= 1000
 */

// 思路：
// 从右上角开始查找，对于该元素行元素比它小， 列元素比它大， 因此即可类似二分查找

class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0) return false;
        int n = matrix.length, m = matrix[0].length, x = 0, y = m - 1;
        while(x < n && y >=0){
            if(matrix[x][y] == target) return true;
            else if(matrix[x][y] > target) y--;
            else x++;
        }
        return false;
    }
}
