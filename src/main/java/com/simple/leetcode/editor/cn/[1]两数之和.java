package com.simple.leetcode.editor.cn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSum {
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            if (nums.length <= 1) {
                return new int[]{0, 0};
            }
            Map<Integer,Integer> map = new HashMap<Integer, Integer>();
            for (int i = 0; i < nums.length; i++) {
                if(map.containsKey(target - nums[i])){
                    return new int[]{map.get(target - nums[i]),i};
                }
                else {
                    map.put(nums[i],i);
                }
            }
            return new int[]{0, 0};
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}