class Solution {
    public int[] productExceptSelf(int[] nums) {
        //题目要求时间复杂度O(n)，还是要辅助数组
        int n=nums.length;
        int[] answer=new int[n];
        int product=1;
        int i=0;
        while(i<n){//将左边的积放在结果数组对应位置上
            answer[i]=product;
            product*=nums[i++];
        }
        product=1;
        while(i>0){//结果数组乘上右边的积
            answer[--i]*=product;
            product*=nums[i];
        }
        return answer;
    }
}