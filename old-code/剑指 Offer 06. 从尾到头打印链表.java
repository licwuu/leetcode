package Java.剑指offer;

import java.util.Stack;

// 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
// 示例 1：

// 输入：head = [1,3,2]
// 输出：[2,3,1]
 
// 限制：

// 0 <= 链表长度 <= 10000

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class S {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while(head != null){
            stack.push(head.val);
            head = head.next;
        }
        int[] ans = new int[stack.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = stack.pop();
        }
        return ans;
    }
}