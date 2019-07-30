class Solution:
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        i=0
        j=0
        while(i<len(nums)):
            if(nums[i]==0):
                nums.pop(i)
                j+=1
            else:
                i+=1
        for j in range(0,j):
            nums.append(0)