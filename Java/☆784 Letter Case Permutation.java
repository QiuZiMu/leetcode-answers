class Solution {
    List<String> res = new ArrayList<>();
    public List<String> letterCasePermutation(String S) {
        char[] cs = S.toCharArray();
        dfs(cs, 0);
        return res;
    }

    private void dfs(char[] cs, int begin) {
        res.add(new String(cs));
        for(int i = begin; i < cs.length; i++){
            if(cs[i]>'9'){
                char tmp = cs[i];
                cs[i] ^=32;
                dfs(cs, i + 1);
                cs[i] = tmp;
            }
        }
    }
}