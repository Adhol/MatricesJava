/**
 * Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа налево,
 * вторая строка слева направо, третья строка справа налево и так далее.
 */

package matrices.task11;

import matrices.Matrix;

public class Task11 extends Matrix {
    public static void main(String[] args) {
        try {
            int[][] matrix = fillMatrix();

            System.out.println("Matrix\n");

            displayMatrix(matrix);
            System.out.println();

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (i % 2 == 0) {
                        System.out.print(matrix[i][matrix[i].length - 1 - j] + "\t");
                    } else {
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
