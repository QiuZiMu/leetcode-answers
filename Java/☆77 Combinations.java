class Solution {
    List<Integer> temp =new ArrayList<>();
    List<List<Integer>>  result=new ArrayList<List<Integer>>();
    public List<List<Integer>> combine(int n, int k) {
        dfs(1,n,k);
        return result;
    }

    public void dfs(int cur,int n,int k){
        if(temp.size()+n-cur+1<k) return;

        if(temp.size()==k) {
            result.add(new ArrayList(temp));
            return;
        }

        temp.add(cur);
        dfs(cur+1,n,k);
        temp.remove(temp.size()-1);
        dfs(cur+1,n,k);
    }
}