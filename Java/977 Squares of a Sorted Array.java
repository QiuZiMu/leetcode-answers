class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int[] list=new int[nums.length];
        int count=right;
        while(left<=right){
            if(square(nums[left])<square(nums[right])){
                list[count]=square(nums[right]);
                right--;
            }else{
                list[count]=square(nums[left]);
                left++;
            }
            count--;
        }
        return list;
    }

    private int square(int a){
        return a*a;
    }
}