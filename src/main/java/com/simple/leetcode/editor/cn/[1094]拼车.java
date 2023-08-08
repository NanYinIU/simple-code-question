package com.simple.leetcode.editor.cn;

class CarPooling {
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean carPooling(int[][] trips, int capacity) {
            int[] path = new int[1000];
            for (int[] trip : trips) {
                int numPassengers = trip[0];
                int from = trip[1];
                int to = trip[2];
                for (int i = from; i < to; i++) {
                    path[i] = path[i] + numPassengers;
                    if (path[i] > capacity) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}