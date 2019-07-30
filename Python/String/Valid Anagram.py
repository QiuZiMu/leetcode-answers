class Solution:
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        i=list(s+"z")
        j=list(t+"z")
        j.sort()
        i.sort()
        if(i==j):
            return True
        else:
            return False