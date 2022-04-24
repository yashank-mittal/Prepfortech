"""
Given the head of a singly linked list, reverse the list, and return the reversed list.
"""
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        next_ele = None
        prev_ele = None
        
        while head:
            next_ele = head.next
            head.next = prev_ele
            prev_ele = head
            head = next_ele
        return prev_ele
        