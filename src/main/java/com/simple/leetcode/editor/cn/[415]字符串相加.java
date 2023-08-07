package com.simple.leetcode.editor.cn;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class AddStrings {
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        public String addStrings(String num1, String num2) {
            ;
            int p1 = num1.length() - 1;
            int p2 = num2.length() - 1;
            int pre = 0;
            LinkedList<String> list = new LinkedList<String>();
            while (p1 >= 0 || p2 >= 0) {
                int v1 = 0;
                int v2 = 0;
                if (p1 >= 0) {
                    v1 = Integer.valueOf(String.valueOf(num1.charAt(p1)));
                    p1 = p1 - 1;
                }
                if (p2 >= 0) {
                    v2 = Integer.valueOf(String.valueOf(num2.charAt(p2)));
                    p2 = p2 - 1;
                }
                int v3 = v1 + v2 + pre;
                pre = 0;
                if (v3 >= 10) {
                    pre = 1;
                    v3 = v3 - 10;
                }
                list.offerFirst(Integer.toString(v3));
            }
            if(pre!=0){
                list.offerFirst(Integer.toString(pre));
            }

            StringBuilder sb = new StringBuilder();
            for (String s : list) {
                sb.append(s);
            }

            return sb.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}