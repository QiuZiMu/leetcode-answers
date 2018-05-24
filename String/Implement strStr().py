class Solution:
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        lh=len(haystack)
        ln=len(needle)
        i=j=0
        if(ln==0):
            return 0
        while i<lh:
            if(haystack[i]==needle[j]):
                j+=1
                if(j>=ln):
                    return i-ln+1
                i+=1
            else:
                i=i-j+1
                j=0
        return -1