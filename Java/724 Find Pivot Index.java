class Solution {
    public int pivotIndex(int[] nums) {
        int i=nums.length;
        int sum=0;
        while(i>0) sum+=nums[--i];
        //因为题目要最左的pivot index，所以从左边遍历
        int left=0;//求左边的和
        while(i<nums.length){
            //当左边与右边相等时，左边+右边+pivot=sum=2*左边+pivot
            if(2*left+nums[i]==sum){
                return i;
            }
            left+=nums[i++];
        }
        return -1;
    }
}