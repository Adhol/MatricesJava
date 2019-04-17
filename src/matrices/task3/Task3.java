/**
 * Дана матрица. Вывести на экран первый и последний столбцы.
 */

package matrices.task3;

import matrices.Matrix;

public class Task3 extends Matrix {
    public static void main(String[] args) {

        try {
            int[][] matrix = fillMatrix();
            System.out.println("Matrix\n");
            displayMatrix(matrix);

            System.out.println("first and last columns of matrix");

            for (int i = 0; i < matrix.length; i ++) {
                System.out.print(matrix[i][0] + "\t" + matrix[i][matrix[i].length - 1] + "\n");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Not correct array length");
        }
    }
}
