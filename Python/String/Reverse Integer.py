class Solution:
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        if(x>=0):
            x=int(str(x)[::-1])
        else:
            x=-int(str(x)[:0:-1])
        if(x>((2**31)-1) or x<-(2**31)):
            return 0
        else:
            return x