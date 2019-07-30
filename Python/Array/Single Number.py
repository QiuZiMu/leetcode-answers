class Solution:
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        l=len(nums)
        for i in range(0,l,2):
            if(i+1==l):
                return nums[i]
            else:
                if(nums[i]!=nums[i+1]):
                    return nums[i]
