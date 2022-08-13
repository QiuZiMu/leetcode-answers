class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(n>m) return false;
        int[] count=new int[26];
        int i=0,diff=0;
        while(i<n){
            ++count[s1.charAt(i)-'a'];
            --count[s2.charAt(i++)-'a'];
        }
        for(int c:count){
            if(c!=0){
                ++diff;
            }
        }
        if(diff==0) return true;
        for(i=n;i<m;i++){
            int x=s2.charAt(i)-'a';
            int y=s2.charAt(i-n)-'a';
            if(x==y){
                continue;
            }
            if(count[x]==0){
                ++diff;
            }
            --count[x];
            if(count[x]==0){
                --diff;
            }
            if(count[y]==0){
                ++diff;
            }
            ++count[y];
            if(count[y]==0){
                --diff;
            }
            if(diff==0) return true;
        }
        
        return false;
    }
}
