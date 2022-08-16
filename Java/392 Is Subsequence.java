class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] cs=s.toCharArray();
        char[] ct=t.toCharArray();
        int p=0;
        for(int i=0;i<ct.length&&p<cs.length;i++){
            if(ct[i]==cs[p]) ++p;
        }
        if(p<cs.length) return false;
        return true;
    }
}