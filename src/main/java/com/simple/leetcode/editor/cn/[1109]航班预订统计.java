package com.simple.leetcode.editor.cn;

class CorporateFlightBookings {

    //leetcode submit region begin(Prohibit modification and deletion)

    class Solution {

        int[] answer = null;

        public int[] corpFlightBookings(int[][] bookings, int n) {
            answer = new int[n];
            for (int i = 0; i < bookings.length; i++) {
                int[] booking = bookings[i];
                int from = booking[0] - 1;
                int to = booking[1] - 1;
                int num = booking[2];
                for (int j = from; j <= to; j++) {
                    answer[j] = answer[j] + num;
                }
            }
            return answer;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}