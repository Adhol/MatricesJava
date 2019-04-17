/**
 * Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.
 */

package matrices.task5;

import matrices.Matrix;

public class Task5 extends Matrix {
    public static void main(String[] args) {

        try {
            int[][] matrix = fillMatrix();
            System.out.println("Matrix\n");
            displayMatrix(matrix);
            System.out.println("even rows of matrix\n");

            for (int i = 0; i < matrix.length; i += 2) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }

        } catch (java.util.InputMismatchException e) {
            System.out.println("Not correct array length");
        }
    }
}
