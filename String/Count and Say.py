class Solution:
    def countAndSay(self, n):
        """
        :type n: int
        :rtype: str
        """
        def strd(n):
            count=1
            prev=0
            rs=""
            if(n==1):
                return "1"
            s=strd(n-1)+"0"
            l=len(s)
            for i in range(l-1):
                prev=s[i]
                if(s[i]==s[i+1]):
                    count+=1
                else:
                    rs=rs+str(count)+str(prev)
                    count=1
            return rs
        return strd(n)