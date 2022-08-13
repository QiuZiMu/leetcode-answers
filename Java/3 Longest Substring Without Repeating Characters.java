class Solution {
    public int lengthOfLongestSubstring(String s) {
        //存储 字符和它的位置
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        int start=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                start=Math.max(map.get(s.charAt(i))+1,start);//start前的字符不能再用
            }
            map.put(s.charAt(i),i);
            max=Math.max(max,i-start+1);
        }
        return max;
    }
}