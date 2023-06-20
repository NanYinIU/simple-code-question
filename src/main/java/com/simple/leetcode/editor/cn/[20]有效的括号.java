package com.simple.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class ValidParentheses {
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> map = new HashMap<Character, Character>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        if(s.length() <= 1){
            return false;
        }

        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if(map.values().contains(s.charAt(i))){
                stack.push(s.charAt(i));
            }
            if(map.keySet().contains(s.charAt(i))){
                if(stack.isEmpty()){
                   return false;
                }
                Character pop = stack.pop();
                if(pop.equals(map.get(s.charAt(i)))){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}