package com.simple.leetcode.editor.cn;

class TwoSumIiInputArrayIsSorted {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int[] result = new int[2];
            int leftIndex = 0;
            int rightIndex = numbers.length - 1;
            while (leftIndex < rightIndex) {
                int res = numbers[leftIndex] + numbers[rightIndex];
                if (res > target) {
                    rightIndex--;
                    continue;
                }
                if (res < target) {
                    leftIndex++;
                    continue;
                }
                result[0] = leftIndex+1;
                result[1] = rightIndex+1;
                break;
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}