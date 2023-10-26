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
    public ListNode partition(ListNode head, int x) {
        ListNode before = new ListNode(-1);
        ListNode after = new ListNode(-1);
        ListNode beforePre = before;
        ListNode afterPre = after;

        while (head != null) {
            if (head.val < x) {
                before.next = head;
                before = before.next;
            } else {
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }
        after.next = null;
        before.next = afterPre.next;
        return beforePre.next;
    }
}

/* public ListNode partition(ListNode head, int x) {

        if (head == null) {
            return head;
        }

        List<ListNode> before = new ArrayList<>();
        List<ListNode> eqAfter = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            ListNode node = new ListNode(curr.val);
            if (curr.val < x) {
                before.add(node);
            } else {
                eqAfter.add(node);
            }

            curr = curr.next;
        }

        ListNode ans = new ListNode(-1);
        head = ans;
        for (int i=0;i<before.size();i++) {
            ListNode node = before.get(i);
            ans.next = node;
            ans = node;
        }

        for (int i=0;i<eqAfter.size();i++) {
            ListNode node = eqAfter.get(i);
            ans.next = node;
            ans = node;
        }
    
        return head.next;
    }
    */