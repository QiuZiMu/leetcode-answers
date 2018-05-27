# The isBadVersion API is already defined for you.
# @param version, an integer
# @return a bool
# def isBadVersion(version):

class Solution(object):
    def firstBadVersion(self, n):
        """
        :type n: int
        :rtype: int
        """
        left=0
        right=n
        while(True):
            mid=(left+right)//2
            if not isBadVersion(mid) and isBadVersion(mid+1):  
                return mid+1  
            elif not isBadVersion(mid) and not isBadVersion(mid+1):  
                left=mid  
            elif isBadVersion(mid) and isBadVersion(mid+1):  
                right=mid  