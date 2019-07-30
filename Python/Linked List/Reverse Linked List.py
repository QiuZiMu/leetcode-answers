# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head:
            p=head
            while(p.next):
                p=p.next
            while(head!=p):
                t=head
                head=head.next
                t.next=p.next
                p.next=t
            return head
        else:
            return head