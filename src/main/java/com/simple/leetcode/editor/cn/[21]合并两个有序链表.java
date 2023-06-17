package com.simple.leetcode.editor.cn;

class MergeTwoSortedLists {
    
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    ListNode dumy = new ListNode();
    ListNode pre = dumy;
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null){
            return pre.next;
        }
        if(list2 == null){
            dumy.next = list1;
            return pre.next;
        }
        if(list1 == null){
            dumy.next = list2;
            return pre.next;
        }
        if(list1.val > list2.val){
            dumy.next = list2;
            list2 = list2.next;
        }else{
            dumy.next = list1;
            list1 = list1.next;
        }
        dumy = dumy.next;
        return mergeTwoLists(list1, list2);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}