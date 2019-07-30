class Solution:
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        l=len(strs)
        if(l==0 ):
            return ""
        if(l==1):
            return strs[0]
        
        def getCP(x,y):
            l=min(len(x),len(y))
            i=0
            if(l==0):
                return ""
            for i in range(l):
                if(x[i]!=y[i]):
                    return x[:i]
            return x[:i+1]
        
        s=getCP(strs[0],strs[1])
        for i in range(1,l-1):
            s=getCP(s,strs[i+1])
        return s