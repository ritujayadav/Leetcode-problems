
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
      ListNode s=head;
        ListNode f=head;
        
        while(f!=null && f.next!=null &&  f.next.next!=null ){
            s=s.next;
            f=f.next.next;
        }
        s.next=rev(s.next);
        s=s.next;
        while(s!=null){
            if(s.val!=head.val){
                return false;
            }
            s=s.next;
            head=head.next;
            
        }
        return true;
    
    }
private ListNode rev(ListNode head){
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