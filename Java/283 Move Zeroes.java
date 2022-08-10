class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        int n=nums.length;
        int i=0;
        while(i<n){
            if(nums[i]==0){
                count++;
            }else{
                nums[i-count]=nums[i];
            }
            i++;
        }
        while(count>0){
            nums[n-count--]=0;
        }
    }
}