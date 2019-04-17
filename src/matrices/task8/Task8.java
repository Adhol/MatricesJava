/**
 * Дан двухмерный массив n×m элементов. Определить, сколько раз встречается число 7 среди элементов массива.
 */

package matrices.task8;

import matrices.Matrix;

public class Task8 extends Matrix {
    public static void main(String[] args) {

        try {

            int[][] matrix = fillMatrix();

            System.out.println("Matrix\n");

            displayMatrix(matrix);

            System.out.println();

            int number = 7;
            int counter = 0;
            System.out.println(number + " of entries is:");


            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == number) {
                        counter++;
                    }
                }
            }
            System.out.println(counter);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Not correct array length");
        }
    }
}
