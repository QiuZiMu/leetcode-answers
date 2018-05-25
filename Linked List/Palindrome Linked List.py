# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def isPalindrome(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        def isPd(s):
            l=len(s)
            mid=round(l/2)
            for i in range(mid):
                if(s[i]!=s[l-1-i]):
                    return False
            return True
        nums=[]
        while(head):
            nums.append(head.val)
            head=head.next
        return isPd(nums)