package com.simple.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

class LongestSubstringWithoutRepeatingCharacters {
//    public static void main(String[] args) {
//       Solution solution = new LongestSubstringWithoutRepeatingCharacters().new Solution();
//    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            Map<Character, Integer> map = new HashMap<Character, Integer>();
            int max = 0;
            int n = s.length();
            for (int start = 0, end = 0; end < n; end++) {
                if (map.containsKey(s.charAt(end))) {
                    start = Math.max(map.get(s.charAt(end)), start);
                }
                max = Math.max(max, end - start + 1);
                map.put(s.charAt(end), end + 1);
            }
            return max;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}