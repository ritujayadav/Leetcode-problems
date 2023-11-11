
class Solution {
    public ListNode reverseList(ListNode head) {
         ListNode newn=null;
          ListNode t=null;
         while(head!=null){
             t=head.next;
             head.next=newn;
             newn=head;
             head=t;  
         }
        return newn;
    }
}