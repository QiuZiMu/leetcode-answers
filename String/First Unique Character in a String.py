class Solution:
    def firstUniqChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        l=len(s)
        dict1 = {}
        for i in range(l):
            if s[i] in dict1:
                dict1[s[i]] += 1
            else:
                dict1[s[i]] = 1
        for i in range(l):
            if dict1[s[i]] == 1:
                return i
        return -1