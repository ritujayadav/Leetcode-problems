
class Solution {
    public ListNode reverseList(ListNode head) {
         ListNode newn=null;
          ListNode next;
         while(head!=null){
             next=head.next;
             head.next=newn;
             newn=head;
             head=next;  
         }
        return newn;
    }
}