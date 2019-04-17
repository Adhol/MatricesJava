/**
 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */

package matrices.task6;

import matrices.Matrix;

public class Task6 extends Matrix {
    public static void main(String[] args) {

        try {
            int[][] matrix = fillMatrix();

            System.out.println("Matrix\n");

            displayMatrix(matrix);
            System.out.println();
            System.out.println("odd columns whose first element is greater than the last\n");


            for (int i = 0; i < matrix.length; i++) {
                for (int j = 1; j < matrix[0].length; j+=2) {
                        if (matrix[0][j] > matrix[matrix.length - 1][j]) {
                            System.out.print(matrix[i][j] + "\t");
                    }
                }
                System.out.println();
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Not correct array length");
        }
    }
}
