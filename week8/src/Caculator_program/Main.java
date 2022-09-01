package Caculator_program;

import java.util.Scanner;

public class Main {
    // static Scanner sc= new Scanner(System.in);

    // static void createMatrix (int [] [] arr, int r, int c){
    // for (int i = 0; i < r; i++) {
    // for (int j = 0; j<c; j++) {
    // System.out.print("Enter a["+(i+1)+"]["+(j+1)+"]: ");
    // arr[i][j]= sc.nextInt();
    // }
    // }
    // }

    // static void printMatrix(int [][]arr, int r, int c){
    // for (int i = 0; i < c; i++) {
    // for (int j = 0; j < r; j++) {
    // System.out.printf("%-5s", arr[i][j]);
    // }
    // System.out.println();
    // }
    // }

    // static void plushTwoMatrix(int[][]arr1, int [][] arr2, int r, int c){
    // int[][] matrix = new int [r][c];
    // for (int i = 0; i < r; i++) {
    // for (int j = 0; j <c; j++) {
    // matrix[i][j]= arr1[i][j]+arr2[i][j];
    // }
    // }
    // printMatrix(matrix, r, c);
    // }
    // public static void main(String[] args) {
    // System.out.print("Enter row: ");
    // int row= sc.nextInt();
    // System.out.print("Enter column: ");
    // int column= sc.nextInt();

    // int [][] matrix1= new int[row][column];
    // createMatrix(matrix1, row, column);
    // System.out.println();
    // printMatrix(matrix1, row, column);

    // int [][] matrix2= new int[row][column];
    // createMatrix(matrix2, row, column);
    // printMatrix(matrix2, row, column);

    // plushTwoMatrix(matrix1, matrix2, row, column);
    // }

    public static void main(String[] args) {
        Caculator cal = new Caculator();
        // cal.createMatrix1();
        // cal.createMatrix2();
        // // cal.additionMatrix();
        // // // cal.subtractionMatrix();
       // cal.mutiplication();
       // System.out.println("check");
        while (true) {
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                cal.createMatrix1();
                cal.createMatrix2();
                cal.additionMatrix();
                    break;
                case 2:
                cal.createMatrix1();
                cal.createMatrix2();
                cal.subtractionMatrix();
                    break;
                case 3:
                cal.createMatrix1();
                cal.createMatrix2();
                cal.mutiplication();

                    break;
                case 4:
                    return;
                    

                default:
                System.out.println("Enter 1-4");
                    break;
            }
        }
    }
}
