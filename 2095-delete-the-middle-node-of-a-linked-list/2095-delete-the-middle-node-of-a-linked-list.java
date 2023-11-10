class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        ListNode k = null;

        if (s == null || s.next == null) {
            // The list is empty or has only one node
            return null; // or return s, depending on your requirement
        }

        while (f != null && f.next != null) {
            k = s;
            s = s.next;
            f = f.next.next;
        }

        // At this point, s is pointing to the middle node
        // Delete the middle node
        if (k != null) {
            k.next = s.next;
        } else {
            // If k is null, it means the head itself is the middle node
            head = head.next;
        }

        return head;
    }
}
