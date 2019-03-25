package matrices.task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Enter row length");
            int rowLength = in.nextInt();
            System.out.println("Enter column length");
            int columnLength = in.nextInt();

            int[][] arr = new int[rowLength][columnLength];

            for (int i = 0; i < arr.length; i ++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = (int) (Math.random() * 10);
                }
            }

            System.out.println("Matrix\n");

            for (int i = 0; i < arr.length; i ++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("odd columns whose first element is greater than the last\n");


            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (j % 2 == 0) {
                        if (arr[0][j] > arr[arr.length - 1][j]) {
                            System.out.print(arr[i][j] + "\t");
                        }
                    }
                }
                System.out.println();
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Not correct array length");
        }
    }
}
