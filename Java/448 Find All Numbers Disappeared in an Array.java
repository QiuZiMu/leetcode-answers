class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i : nums){
            nums[Math.abs(i)-1]=-Math.abs(nums[Math.abs(i)-1]);
        }
        List<Integer> l=new ArrayList();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                l.add(i+1);
            }
        }
        return l;
    }
}