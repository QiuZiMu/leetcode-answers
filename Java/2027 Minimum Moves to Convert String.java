class Solution {
    public int minimumMoves(String s) {
        int t=0;//记录move数
        int i=0;//记录'X'位置
        int n=s.length();
        while(i<n){
            while(i<n&&s.charAt(i)!='X'){
                i++; //找出'X'位置
            }
            if(i>=n) return t;//已经没有'X'了
            t++;
            i=i+3;//从move后的位置直接便利
        }
        return t;
    }
}