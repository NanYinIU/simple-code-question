package com.simple.leetcode.editor.cn;

class BestTimeToBuyAndSellStock {
  
  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {

      public int maxProfit(int[] prices) {
          int min = Integer.MAX_VALUE;
          int max = 0;
          for (int i = 0; i < prices.length; i++) {
              // 找到最小的买入价格
              min = Math.min(min, prices[i]);
              // 当前价格-最小的价格 = 当前利润，取最大值
              max = Math.max(prices[i] - min, max);
          }
          return max;
      }
  }
//leetcode submit region end(Prohibit modification and deletion)

}