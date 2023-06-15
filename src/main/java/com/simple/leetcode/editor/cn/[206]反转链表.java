package com.simple.leetcode.editor.cn;//给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
//
// 
// 
// 
// 
// 
//
// 示例 1： 
// 
// 
//输入：head = [1,2,3,4,5]
//输出：[5,4,3,2,1]
// 
//
// 示例 2： 
// 
// 
//输入：head = [1,2]
//输出：[2,1]
// 
//
// 示例 3： 
//
// 
//输入：head = []
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点的数目范围是 [0, 5000] 
// -5000 <= Node.val <= 5000 
// 
//
// 
//
// 进阶：链表可以选用迭代或递归方式完成反转。你能否用两种方法解决这道题？ 
//
// Related Topics 递归 链表 👍 3184 👎 0


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
    ListNode preNode = null;
    ListNode dumy = null;

    // 递归的解法
//    public ListNode reverseList(ListNode head) {
//        if (head == null) {
//            return head;
//        }
//        dumy = head;
//
//        ListNode currentNode = head;
//        ListNode next = head.next;
//
//        // 翻转节点引用
//        currentNode.next = preNode;
//
//        // preNode 始终指向需要翻转的节点位置
//        // curNode 始终执行下一个需要翻转的节点位置
//        // pre          cur
//        // 1 -> null ->  2
//        // pre                cur
//        // 2 ->  1 ->  null -> 3
//        preNode = currentNode;
//        currentNode = next;
//
//        reverseList(currentNode);
//        return dumy;
//    }

    // 循环迭代的的方式
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode pre = null;
        ListNode cur = head;

        ListNode next = null;
        while (cur != null){
            next = cur.next;

            cur.next = pre;

            pre = cur;
            cur = next;
        }
        return pre;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
