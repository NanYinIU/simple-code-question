package com.simple.leetcode.editor.cn;

import java.util.Arrays;

class MergeSortedArray {
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}