class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i1=0;
        int i2=numbers.length-1;
        while(i1<i2){
            int sum=numbers[i1]+numbers[i2];
            if(target>sum){
                i1++;
            }else if(target<sum){
                i2--;
            }else{
                return new int[]{i1+1,i2+1};
            }
        }
        return new int[]{-1,-1};
    }
}