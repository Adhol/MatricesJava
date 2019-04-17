/**
 * Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов.
 */

package matrices.task7;

import matrices.Matrix;

public class Task7 extends Matrix {
    public static void main(String[] args) {

        try {

            int[][] matrix = fillMatrix();

            System.out.println("Matrix\n");

            displayMatrix(matrix);

            System.out.println("sum of abs negative is:");

            int sum = 0;

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] < 0) {
                        sum+=Math.abs(matrix[i][j]);
                    }
                }
            }
            System.out.println(sum);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Not correct array length");
        }
    }
}
