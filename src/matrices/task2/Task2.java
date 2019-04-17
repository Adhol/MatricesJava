/**
 * Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9].
 */

package matrices.task2;

import matrices.Matrix;

public class Task2 extends Matrix {
    public static void main(String[] args) {

        try {
            int[][] arr = fillMatrix();
            displayMatrix(arr);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Not correct array length");
        }
    }
}
