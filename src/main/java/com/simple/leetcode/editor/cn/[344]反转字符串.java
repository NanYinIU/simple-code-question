package com.simple.leetcode.editor.cn;

class ReverseString {
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void reverseString(char[] s) {
        int left =0;
        int right = s.length - 1;
        while(left < right){
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left ++;
            right --;
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}