class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int count=0;
        int l=gas.length;
        int i=0;
        int oil=0;
        int start=0;
        while(count<l){
            i=(start+count)%l;
            oil=oil+gas[i]-cost[i];
            count++;
            if(oil<0){
                if(i<start){
                    return -1;
                }
                count=0;
                oil=0;
                start=i+1;
            }
        }
        return start;
    }
}