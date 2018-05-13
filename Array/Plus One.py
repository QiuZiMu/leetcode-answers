class Solution:
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        l=len(digits)
        for i in range(0,l):
            if(digits[l-i-1]==9):
                digits[l-i-1]=0
                if(i==l-1):
                    digits.insert(0,1)
            else:
                digits[l-i-1]+=1
                break
        return digits