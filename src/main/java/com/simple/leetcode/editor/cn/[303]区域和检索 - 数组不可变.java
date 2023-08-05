package com.simple.leetcode.editor.cn;

class RangeSumQueryImmutable {
  
  //leetcode submit region begin(Prohibit modification and deletion)
  class NumArray {

      int[] sumArray;

      public NumArray(int[] nums) {
          if (nums.length < 1) {
              return;
          }
          sumArray = new int[nums.length + 1];
          sumArray[0] = 0;
          // 构造和的数组
          for (int i = 0; i < nums.length; i++) {
              sumArray[i + 1] = nums[i] + sumArray[i];
          }
      }


      // -2, 0, 3, -5, 2, -1
      // 0 ,-2,-2, 1, -4, -2, -1
      //
      public int sumRange(int left, int right) {
          if (left > right || left > sumArray.length) {
              return 0;
          }
          left = Math.max(left, 0);
          right = Math.min(right, sumArray.length);
          return sumArray[right + 1] - sumArray[left];
      }
  }

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
//leetcode submit region end(Prohibit modification and deletion)

}