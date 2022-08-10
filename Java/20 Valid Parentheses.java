class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        //使用数组p和指示器j模仿栈
        int[] p=new int[n>>1];//栈的深度只要n/2
        int j=-1;
        
        int i=0;
        //排除明显异常情况
        if(n%2==1||s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']'){
            return false;
        }
        while(i<n){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                if(++j>=n>>1){//入栈的个数溢出
                    return false;
                }
                p[j]=i;//入栈
            }else{
                if(j<0){
                    return false;//栈已经空了
                }
                int t=s.charAt(i)-s.charAt(p[j]);
                if(t==1||t==2){//利用左括号和右括号的差值判断是否匹配
                    j--;//出栈
                }else{
                    return false;//括号不匹配
                }
            }
            i++;
        }
        if(j>=0){//遍历结束栈没空
            return false;
        }
        return true;
    }
}