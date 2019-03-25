package matrices.task9;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Enter square matrix length");
            int matrixLength = in.nextInt();

            int[][] arr = new int[matrixLength][matrixLength];

            for (int i = 0; i < arr.length; i ++) {
                for (int j = 0; j < arr.length; j++) {
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
            System.out.println("diagonal elements:");


            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (i == j) {
                        System.out.print(arr[i][j] + "\t");
                    }
                }
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Not correct array length");
        }
    }
}
