class Solution {
    //斐波那契数列
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int i1 = 1;
        int i2 = 2;
        int temp=3;
        for(int i=3;i<=n;i++){
            i1 = i2;
            i2 = temp;
            temp= i1+i2;
        }
        return i2;
    }
}