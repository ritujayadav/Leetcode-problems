
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode d=new ListNode();
        ListNode t=d;
         int c=0;
        while(l1!=null || l2!=null || c==1){
    int s=0;
       
            if(l1!=null){
                s+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                s+=l2.val;
                l2=l2.next;
            }
        s+=c;
             c=s/10;
        ListNode newn=new ListNode(s%10);
            t.next=newn;
            t=t.next;
       
        }
        return d.next;
    }
}