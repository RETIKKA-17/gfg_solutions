class Solution {
    public ArrayList<ArrayList<Integer>> multiplyMatrices(int[][] a, int[][] b) {

        int rows = a.length;
        int cols = b[0].length;
        int column = a[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < column; k++) {

                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j < cols; j++) {
                row.add(result[i][j]);
            }

            ans.add(row);
        }

        return ans;
    }
}