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
            if isBadVersion(mid)==False and isBadVersion(mid+1)==True:  
                return mid+1  
            elif isBadVersion(mid)==False and isBadVersion(mid+1)==False:  
                left=mid  
            elif isBadVersion(mid)==True and isBadVersion(mid+1)==True:  
                right=mid 