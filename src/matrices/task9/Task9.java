/**
 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */
package matrices.task9;

import matrices.Matrix;

public class Task9 extends Matrix {
    public static void main(String[] args) {

        try {

            int[][] matrix = fillSquareMatrix();

            System.out.println("Matrix\n");

            displayMatrix(matrix);
            System.out.println();
            System.out.println("diagonal elements:");

            for (int i = 0; i < matrix.length; i++) {
                System.out.print(matrix[i][i] + "\t");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Not correct array length");
        }
    }
}
