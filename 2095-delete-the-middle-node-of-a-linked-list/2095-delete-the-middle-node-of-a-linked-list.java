class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        ListNode k=null;
        if(s.next==null) {
            return null; 
        }
        while(f!=null && f.next!=null) {
            k=s;
            s=s.next;
            f=f.next.next;
        }
        if(k!=null) {
            k.next=s.next;
        }
        return head;
    }
}
