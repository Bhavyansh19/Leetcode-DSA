class Solution {
    public void rotate(int[][] matrix) {
        int edgelength = matrix.length;
        int top = 0;
        int bottom = edgelength - 1;

        while (top < bottom) {
            for (int col = 0; col < edgelength; col++) {
                int temp = matrix[top][col];
                matrix[top][col] = matrix[bottom][col];
                matrix[bottom][col] = temp;
            }
            top++;
            bottom--;
        }
        for (int row = 0; row < edgelength; row++) {
            for (int col = row + 1; col < edgelength; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
    }
}
