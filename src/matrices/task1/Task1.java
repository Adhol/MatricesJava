/**
 * Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была ровно одна единица,
 * и вывести на экран.
 */
package matrices.task1;

import matrices.Matrix;

import java.util.Scanner;

public class Task1 extends Matrix {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Enter row length");
            int rowLength = in.nextInt();
            System.out.println("Enter column length");
            int columnLength = in.nextInt();

            int[][] matrix = new int[rowLength][columnLength];

            for (int i = 0; i < matrix.length; i ++) {
                matrix[i][0] = 1;
            }
            displayMatrix(matrix);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Not correct array length");
        }
    }

}
