class Solution {
    public int[][] updateMatrix(int[][] matrix) {
        int[] dx={-1,1,0,0},dy={0,0,-1,1};
        int m = matrix.length, n = matrix[0].length;
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<int[]>();
        // 将所有的 0 添加进初始队列中
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (matrix[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }
        // 广度优先搜索
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int i = cell[0], j = cell[1];
            for (int k = 0; k < 4; ++k) {
                int x = i + dx[k];
                int y = j + dy[k];
                if (x >= 0 && x < m && y >= 0 && y < n && !visited[x][y]) {
                    matrix[x][y] = matrix[i][j] + 1;
                    queue.offer(new int[]{x, y});
                    visited[x][y] = true;
                }
            }
        }
        return matrix;
    }
}