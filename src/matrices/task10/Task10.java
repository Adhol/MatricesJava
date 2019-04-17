/**
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

package matrices.task10;

import matrices.Matrix;

import java.util.Scanner;

public class Task10 extends Matrix {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        try {
            int[][] matrix = fillMatrix();

            System.out.println("Matrix\n");

            displayMatrix(matrix);
            System.out.println();

            System.out.println("row for display");
            int row = in.nextInt();
            System.out.println("column for display");
            int column = in.nextInt();

            System.out.println();
            System.out.println("row\n");

            for (int i = 0; i < matrix[0].length; i++) {
                System.out.print(matrix[row - 1][i] + "\t");
            }

            System.out.println("\n");
            System.out.println("column");

            for (int i = 0; i < matrix.length; i++) {
                System.out.println(matrix[i][column - 1]);
            }

        } catch (java.util.InputMismatchException e) {
            System.out.println("Not correct array length");
        }
    }
}
