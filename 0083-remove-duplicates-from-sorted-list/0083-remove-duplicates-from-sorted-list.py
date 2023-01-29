
class Solution:
    def deleteDuplicates(self, head: ListNode) -> ListNode:
        current=head
        while current:
            
            if current.next and current.next.val==current.val:
                current.next=current.next.next
            else:
                current=current.next
        return head
