class Solution {
    public void addMat(int[][] a, int[][] b) {

        int rows = a.length;
        int cols = a[0].length;

        

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                a[i][j] = a[i][j] + b[i][j];
            }
        }
    }
}