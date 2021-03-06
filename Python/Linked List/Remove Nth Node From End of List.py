# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        p=q=ListNode(0)
        p.next=q.next=head
        head=p
        for i in range(n):
            q=q.next
        while(q.next):
            p=p.next
            q=q.next
        p.next=p.next.next
        return head.next