class Solution {
    List<List<Integer>> result=new ArrayList<List<Integer>>();
    List<Integer> temp = new ArrayList<Integer>();
    public List<List<Integer>> permute(int[] nums) {
        dfs(nums);
        return result;
    }

    public void dfs(int[] nums){
        if(temp.size()==nums.length){
            result.add(new ArrayList<Integer>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            dfs(nums);
            temp.remove(temp.size()-1);
        }
    }
}