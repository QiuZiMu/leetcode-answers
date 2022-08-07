class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length;  
        for(int i=nums.length/2;left<right;i=(right+left)>>1){//除以2改成右移一位
            if(target>nums[i]){
                left=i+1;
            }else if(target<nums[i]){
                right=i;
            }else{
                return i;
            }
        }
        return -1;
    }
}