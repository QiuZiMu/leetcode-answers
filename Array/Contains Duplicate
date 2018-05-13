class Solution:
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        t=len(nums)
        if(t>1):
            nums.sort()
            for i in range(t-1) :
                if nums[i] == nums[i+1]:
                    return True
        return False
