# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:      
    def isSymmetric(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """    
        def iss(p, q):
            if p == None and q == None: return True
            if p and q and p.val == q.val:
                return iss(p.right, q.left) and iss(p.left, q.right)
            return False
    
        if root:
            return iss(root.left, root.right)
        return True