class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int rows = triangle.size();
        int[] pathSum = new int[rows + 1];
        for (int row = rows - 1; row >= 0; row--) {
            minimumTotal(triangle, row, pathSum);   
        }
        return pathSum[0];
    }

    public void minimumTotal(List<List<Integer>> triangle, int row, int[] pathSum) {
        for (int col = 0; col <= row; col++) {
            if (pathSum[col] < pathSum[col + 1]) {
                pathSum[col] += triangle.get(row).get(col);    
            } else {
                pathSum[col] = triangle.get(row).get(col) + pathSum[col + 1];    
            }
        }
    }
}