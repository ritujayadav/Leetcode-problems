
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode s=head;
        ListNode f=head;
           ListNode start=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(f==s){
                while(s!=start){
                    start=start.next;
                    s=s.next;
                }
                return start;
            }
        }
        return null;
    }
}
