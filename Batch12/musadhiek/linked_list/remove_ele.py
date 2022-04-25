"""
Given the head of a linked list and an integer val, 
remove all the nodes of the linked list that has Node.val == val, and return the new head."""
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeElements(self, head: Optional[ListNode], val: int) -> Optional[ListNode]:
        while head and head.val==val:
            head=head.next
        prev = None
        current = head
        while current:
            if current and current.val == val:
                prev.next = current.next
            else:
                prev = current
            current = current.next
            
        return head