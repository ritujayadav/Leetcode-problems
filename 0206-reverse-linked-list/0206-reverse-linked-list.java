
class Solution {
    public ListNode reverseList(ListNode head) {
         ListNode newn=null;
         
         while(head!=null){
             ListNode next=head.next;
             head.next=newn;
             newn=head;
             head=next;
             
         }
        return newn;
        
    }
}