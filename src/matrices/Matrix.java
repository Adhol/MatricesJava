package matrices;

import java.util.Scanner;

public class Matrix {

    static Scanner in = new Scanner(System.in);

    public static int[][] fillMatrix() {
        System.out.println("Enter num of rows");
        int numOfRows = in.nextInt();
        System.out.println("Enter num of columns");
        int numOfColumns = in.nextInt();

        int[][] matrix = new int[numOfRows][numOfColumns];

        for (int i = 0; i < matrix.length; i ++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (-5 + Math.random() * 20);
            }
        }
        return matrix;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i ++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] fillSquareMatrix() {
        System.out.println("Enter num of rows and columns");
        int numOfRowsAndColumns = in.nextInt();

        int[][] matrix = new int[numOfRowsAndColumns][numOfRowsAndColumns];

        for (int i = 0; i < matrix.length; i ++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }
}
