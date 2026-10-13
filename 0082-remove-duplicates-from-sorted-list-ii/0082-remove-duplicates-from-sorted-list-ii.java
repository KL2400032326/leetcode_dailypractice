class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode d = new ListNode(0);
        d.next = head;
        ListNode temp = d;

        while (temp.next != null && temp.next.next != null) {
            ListNode p = temp.next;

            if (p.val == p.next.val) {
                while (p.next != null && p.val == p.next.val) {
                    p = p.next;
                }
                temp.next = p.next;
            } else {
                temp = temp.next;
            }
        }

        return d.next;
    }
}