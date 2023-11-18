class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       int c=0;
        ListNode tem=head;
        while(tem!=null){
            c=c+1;
            tem=tem.next;
        }
        ListNode newhead=head;
 
        int x=c-n;
        if(x==0){
        return newhead.next;
        }
        ListNode t=head;
        for(int i=1;i<x;i++){
            t=t.next;
        }
        t.next=t.next.next;
        return head;
    }
}