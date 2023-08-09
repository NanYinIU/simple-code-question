package com.simple.leetcode.editor.cn;

class RemoveDuplicatesFromSortedArray {
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        public int removeDuplicates(int[] nums) {
            int i = 0, j = 0;
            while (j < nums.length) {
                if(nums[i] != nums[j]){
                    i = i + 1;
                    System.out.println(i+","+j);
                    nums[i] = nums[j];
                }
                j = j+ 1;
            }
            for (int k = i + 1; k < nums.length; k++) {
                nums[k] = 0;
            }
            return i+1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}