"""
Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying 
the values in the list's nodes (i.e., only nodes themselves may be changed.)
"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        first_node = head
        new_head = head
        if head and head.next!= None:
            new_head = head.next
        
        while(head and head.next):
            second_node = first_node.next
            temp = second_node.next
            second_node.next = first_node
            
            if temp == None or temp.next == None:
                first_node.next = temp
                break
            first_node.next = temp.next
            first_node = temp
        return new_head