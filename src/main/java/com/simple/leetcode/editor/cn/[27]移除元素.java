package com.simple.leetcode.editor.cn;

class RemoveElement {
  
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
      public int removeElement(int[] nums, int val) {
          int fast = 0, slow = 0;
          while (fast < nums.length) {
              if (nums[fast] != val) {
                  nums[slow] = nums[fast];
                  slow++;
              }
              fast++;
          }
          for (int i = slow; i < fast; i++) {
              nums[i] = 0;
          }
          return slow;
      }
}
//leetcode submit region end(Prohibit modification and deletion)

}