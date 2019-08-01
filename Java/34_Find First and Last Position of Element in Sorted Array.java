class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0) return new int[] {-1,-1};
        int i=0,j=nums.length-1,mid;
        if(target<nums[i]||target>nums[j]) return new int[] {-1,-1};
        while(i<=j){
            mid=(j-i)/2+i;
            if(nums[mid]>=target){
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        if(nums[i]!=target) return new int[] {-1,-1};
        int begin=i;
        j=nums.length-1;
        while(i<=j){
            mid=(j-i)/2+i;
            if(nums[mid]>target){
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return new int[] {begin,j};
    }
}