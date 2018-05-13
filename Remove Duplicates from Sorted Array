class Solution:
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if not nums:
            return 0
        i=0
        while(i+1<len(nums)):
            if(nums[i]==nums[i+1]):
                nums.pop(i+1)
            else:
                i+=1
        return i+1
