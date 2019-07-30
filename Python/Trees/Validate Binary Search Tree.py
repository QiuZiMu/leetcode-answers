# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def isValidBST(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        def search(root):
            s=[]
            if(root):
                if(root.left):
                    s.extend(search(root.left))
                s.append(root.val)
                if(root.right):
                    s.extend(search(root.right))
            return s
        s=search(root)
        for i in range(len(s)-1):
            if(s[i]>=s[i+1]):
                return False
        return True