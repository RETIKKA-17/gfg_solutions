class Solution {
    public int sumOfMatrix(int[][] mat) {

        int i, j, sum = 0;

        for(i = 0; i < mat.length; i++) {

            for(j = 0; j < mat[i].length; j++) {

                sum += mat[i][j];
            }
        }

        return sum;
    }
}