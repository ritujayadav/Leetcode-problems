class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
    ListNode current=head;
        while(current.next!=null){
            int gcd=gcd(current.val,current.next.val);
            ListNode next=current.next;
            current.next=new ListNode(gcd,next);
            current=next;
            
        }
        return head;
    }
    private int gcd(int m,int n){
        if(n==0){
            return m;
        }
        else{
            return gcd(n,m%n);
        }
    }

}










