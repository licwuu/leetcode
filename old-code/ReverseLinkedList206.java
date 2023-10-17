package editor.cn;

public class ReverseLinkedList206 {
    public static void main(String[] args) {
        Solution solution = new ReverseLinkedList206().new Solution();
    }
    private class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */


    class Solution {
        public ListNode reverseList(ListNode head) {
            if(head == null || head.next == null){
                return head;
            }

            ListNode one = null, two = head;

            while (two != null){
                ListNode tmp = two.next;
                two.next = one;
                one = two;
                two = tmp;
            }
            return one;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}