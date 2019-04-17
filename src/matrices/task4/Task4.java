/**
 * Дана матрица. Вывести на экран первую и последнюю строки.
 */
package matrices.task4;

import matrices.Matrix;

public class Task4 extends Matrix {
    public static void main(String[] args) {

        try {
            int[][] matrix = fillMatrix();

            System.out.println("Matrix\n");

            displayMatrix(matrix);
            System.out.println();

            System.out.println("first and last rows of matrix\n");
            for (int i = 0; i < matrix[0].length; i++) {
                System.out.print(matrix[0][i] + "\t");
            }
            System.out.println();
            for (int i = 0; i < matrix[0].length; i++) {
                System.out.print(matrix[matrix.length - 1][i] + "\t");
            }

        } catch (java.util.InputMismatchException e) {
            System.out.println("Not correct array length");
        }
    }
}
