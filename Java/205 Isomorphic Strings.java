class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] cs=s.toCharArray();
        char[] ct=t.toCharArray();
        int[] as=new int[128];
        int[] at=new int[128];
        for(int i=0;i<cs.length;++i){
            if(as[cs[i]]!=at[ct[i]]) return false;//比较上次位置
            as[cs[i]]=i+1;//记录位置
            at[ct[i]]=i+1;//记录位置
        }
        return true;
    }
}

