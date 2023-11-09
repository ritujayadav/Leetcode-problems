
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null){
            return false;
        }
        ListNode t=head;
        ListNode x=head;
        while(t.next!=null && t.next.next !=null){
            t=t.next.next;
            x=x.next;
            if(t==x){
                return true;
            }
        }
            return false;
        
    }
}