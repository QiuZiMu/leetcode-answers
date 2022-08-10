class Solution {
    public String reverseWords(String s) {
        int left=0;
        int right=0;
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(' '==c[i]){
                c=reverse(c,left,right);
                left=i+1;
                right++;
            }else{
                right++;
            }
        }
        c=reverse(c,left,right);
        return new String(c);
    }

    public char[] reverse(char[] c,int left,int right){
        for(int i=left;i<left+right>>1;i++){
            char temp=c[i];
            c[i]=c[right+left-i-1];
            c[right+left-i-1]=temp;
        }
        return c;
    }
}