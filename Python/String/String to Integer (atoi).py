class Solution:
    def myAtoi(self, strs):
        """
        :type str: str
        :rtype: int
        """
        INT_MIN=-2**31
        INT_MAX=2**31-1
        str=strs.lstrip(" ")
        l=len(str)
        i=k=0
        if(l==0):
            return 0
        if(str[0]=="-" or str[0]=="+"):
            i=k=1
        while i<l:
            if(str[i].isdigit()):
                i+=1
            else:
                break 
        s=str[0:k]+str[k:i]
        if(i==0):
            return 0
        else:
            try:
                n=int(s)
            except:
                return 0
            if(n>INT_MAX):
                return INT_MAX
            elif(n<INT_MIN):
                return INT_MIN
            else:
                return n