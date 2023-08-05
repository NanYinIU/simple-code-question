package com.simple.leetcode.editor.cn;

class RangeSumQuery2dImmutable {

    //leetcode submit region begin(Prohibit modification and deletion)
    class NumMatrix {
        int[][] sumMatrix;

        public NumMatrix(int[][] matrix) {
            int rows = matrix.length;
            if (rows == 0) {
                return;
            }
            int cols = matrix[0].length;
            sumMatrix = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (i == 0 && j == 0) {
                        sumMatrix[i][j] = matrix[i][j];
                    }
                    if (i == 0 && j > 0) {
                        sumMatrix[i][j] = matrix[i][j] + sumMatrix[i][j - 1];
                    }
                    if (i > 0 && j == 0) {
                        sumMatrix[i][j] = matrix[i][j] + sumMatrix[i - 1][j];
                    }
                    if (i > 0 && j > 0) {
                        sumMatrix[i][j] = matrix[i][j] + sumMatrix[i - 1][j] + sumMatrix[i][j - 1] - sumMatrix[i - 1][j - 1];
                    }
                    System.out.println("i=" + i + " j=" + j + ": " + sumMatrix[i][j]);
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            int result = sumMatrix[0][0];
            // 1 1 2 2
            // 21 - 18 - 17 + 14 = 0...

            if (row1 > 0 && col1 > 0) {
                result = sumMatrix[row2][col2] -
                        sumMatrix[row1 - 1][col2] -
                        sumMatrix[row2][col1 - 1] +
                        sumMatrix[row1 - 1][col1 - 1];
            } else if (row1 > 0 & col1 == 0) {
                result = sumMatrix[row2][col2] -
                        sumMatrix[row1 - 1][col2];
            } else if (row1 == 0 && col1 > 0) {
                result = sumMatrix[row2][col2] -
                        sumMatrix[row2][col1 - 1];
            } else return sumMatrix[row2][col2];
            return result;
        }
    }

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
//leetcode submit region end(Prohibit modification and deletion)

}