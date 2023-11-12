public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode f=headA;
        ListNode s=headB;
        while(f!=s) {
            if(f==null) {
                f=headB;
            } 
            else{
                f=f.next;
            }
            if(s==null) {
                s=headA;
            }else
            {
                s=s.next;
            }
        }
        return f; 
    }
}