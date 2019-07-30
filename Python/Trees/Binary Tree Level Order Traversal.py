# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def levelOrder(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        s=[root]
        r=[]
        while(s and s[0]):
            k=[]
            l=len(s)
            for i in range(l):
                t=s.pop(0)
                k.append(t.val)
                if(t.left):
                    s.append(t.left)
                if(t.right):
                    s.append(t.right)
            r.append(k)
        return r