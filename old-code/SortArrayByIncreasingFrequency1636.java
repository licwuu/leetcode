package editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SortArrayByIncreasingFrequency1636 {
    public static void main(String[] args) {
        Solution solution = new SortArrayByIncreasingFrequency1636().new Solution();
        solution.frequencySort(new int[]{
                1,1,2,2,2,3
        });
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] frequencySort(int[] nums) {
            HashMap<Integer, int[]> map = new HashMap<>();
            ArrayList<int[]> list = new ArrayList<>();
            for (int num : nums) {
                if (map.containsKey(num)) {
                    int[] bucket = map.get(num);
                    bucket[1]++;
                } else {
                    int[] bucket = {num, 1};
                    map.put(num, bucket);
                    list.add(bucket);
                }
            }
            list.sort((int[] a,int[] b) -> {
                if (a[1] != b[1]) return a[1] - b[1];
                return b[0] - a[0];
            });
            int[] res = new int[nums.length];
            int index = 0;
            for (int i = 0; i < list.size(); i++) {
                int[] bucket = list.get(i);
                for (int j = 0; j < bucket[1]; j++) {
                    res[index++] = bucket[0];
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}