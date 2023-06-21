package com.simple.leetcode.editor.cn;

class LinkedListCycle {
    
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (slow.next != null && fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
//            System.out.println("fast.val=" + fast.val + " slow.val="+slow.val);
            if (fast != null && fast.next == slow.next) {
                return true;
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}