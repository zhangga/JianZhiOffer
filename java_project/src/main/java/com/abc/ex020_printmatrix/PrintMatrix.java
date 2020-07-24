package com.abc.ex020_printmatrix;

/**
 * Created by U-Demon
 * Date: 2020/6/18
 */
public class PrintMatrix {

    public static void print(int[][] matrix) {
        if (matrix == null || matrix.length == 0)
            return;
        int rowMin = 0, rowMax = matrix.length-1, colMin = 0, colMax = matrix[0].length-1;
        int r = 0, c = 0;
        StringBuilder sb = new StringBuilder();
        while (rowMin < rowMax && colMin < colMax) {
            r = rowMin;
            c = colMin;
            while (c < colMax) {
                sb.append(matrix[rowMin][c]).append(",");
                c++;
            }
            sb.append("\r\n");
            while (r < rowMax) {
                sb.append(matrix[r][colMax]).append(",");
                r++;
            }
            sb.append("\r\n");
            while (c > colMin) {
                sb.append(matrix[r][c]).append(",");
                c--;
            }
            sb.append("\r\n");
            while (r > rowMin) {
                sb.append(matrix[r][c]).append(",");
                r--;
            }
            sb.append("\r\n");
            colMin++;
            rowMin++;
            colMax--;
            rowMax--;
        }
        System.out.println(sb.toString());
    }

}
