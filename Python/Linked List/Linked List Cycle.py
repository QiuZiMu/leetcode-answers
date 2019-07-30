# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def hasCycle(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        curr = head
        while curr is not None:
            nextnode = curr.next
            if nextnode is head:
                return True
            curr.next = head
            curr = nextnode
        return False