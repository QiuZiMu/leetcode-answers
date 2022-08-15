class Solution {
    public int orangesRotting(int[][] grid) {
        int[] dx={-1,1,0,0},dy={0,0,-1,1};
        int m=grid.length,n=grid[0].length;
        Queue<int[]> queue=new LinkedList<int[]>();
        int fresh=0,minutes=0,size=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    queue.offer(new int[]{i,j});
                }else if(grid[i][j]==1){
                    ++fresh;
                }
            }
        }
        if(queue.isEmpty()){
            if(fresh==0) return 0;
            else return -1;
        } 
        //层次遍历
        while(!queue.isEmpty()){
            size=queue.size();
            ++minutes;
            for(int d=0;d<size;++d){
                int[] cell=queue.poll();
                int i=cell[0],j=cell[1];
                for(int k=0;k<4;k++){
                    int x=i+dx[k],y=j+dy[k];
                    if(x>=0&&x<m&&y>=0&&y<n&&grid[x][y]==1){
                        queue.offer(new int[]{x,y});
                        --fresh;
                        grid[x][y]=2;
                    }
                }
            }
        }
        if(fresh>0) return -1;
        return minutes-1;

    }
}