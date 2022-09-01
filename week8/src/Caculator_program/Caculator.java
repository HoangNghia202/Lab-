package Caculator_program;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthPanelUI;

public class Caculator {
    static Scanner sc = new Scanner(System.in);
    Matrix mtx1 = new Matrix();
    Matrix mtx2 = new Matrix();

    public void printMatrix(Matrix mtx) {
        int arr[][] = mtx.getMatrix();
        for (int i = 0; i < mtx.getRow(); i++) {
            for (int j = 0; j < mtx.getColumn(); j++) {
                System.out.print("[" + arr[i][j] + "]");
            }
            System.out.println();
        }
    }

    public void createMatrix1() {
        int r, c;
        int[][] arr;
        System.out.println("Enter row matrix 1 : ");
        r = sc.nextInt();
        mtx1.setRow(r);
        System.out.println("Enter column matrix 1: ");
        c = sc.nextInt();
        mtx1.setColumn(c);
        arr = new int[r][c];
        for (int i = 0; i < mtx1.getRow(); i++) {
            for (int j = 0; j < mtx1.getColumn(); j++) {
                System.out.print("Enter a[" + (i + 1) + "][" + (j + 1) + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
        mtx1.setMatrix(arr);
    }

    public void createMatrix2() {
        int r, c;
        int[][] arr;
        System.out.println("Enter row matrix 2 : ");
        r = sc.nextInt();
        mtx2.setRow(r);
        System.out.println("Enter column matrix 2: ");
        c = sc.nextInt();
        mtx2.setColumn(c);
        arr = new int[r][c];
        for (int i = 0; i < mtx2.getRow(); i++) {
            for (int j = 0; j < mtx2.getColumn(); j++) {
                System.out.print("Enter a[" + (i + 1) + "][" + (j + 1) + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
        mtx2.setMatrix(arr);

    }

    public void additionMatrix() {
        if (mtx1.getRow() != mtx2.getRow() && mtx1.getColumn() != mtx2.getColumn()) {
            System.out.println("two matrix is not same size");
            return;
        }

        int[][] arr3 = new int[mtx1.getRow()][mtx2.getColumn()];
        int[][] arr1 = mtx1.getMatrix();
        int[][] arr2 = mtx2.getMatrix();

        for (int i = 0; i < mtx1.getRow(); i++) {
            for (int j = 0; j < mtx1.getColumn(); j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        Matrix mtx3 = new Matrix(arr3, mtx1.getRow(), mtx1.getColumn());

        printMatrix(mtx1);
        System.out.println("+");
        printMatrix(mtx2);
        System.out.println("=");
        printMatrix(mtx3);

    }

    public void subtractionMatrix() {
        if (mtx1.getRow() != mtx2.getRow() && mtx1.getColumn() != mtx2.getColumn()) {
            System.out.println("two matrix is not same size");
            return;
        }

        int[][] arr3 = new int[mtx1.getRow()][mtx2.getColumn()];
        int[][] arr1 = mtx1.getMatrix();
        int[][] arr2 = mtx2.getMatrix();

        for (int i = 0; i < mtx1.getRow(); i++) {
            for (int j = 0; j < mtx1.getColumn(); j++) {
                arr3[i][j] = arr1[i][j] - arr2[i][j];
            }
        }

        Matrix mtx3 = new Matrix(arr3, mtx1.getRow(), mtx1.getColumn());

        printMatrix(mtx1);
        System.out.println("-");
        printMatrix(mtx2);
        System.out.println("=");
        printMatrix(mtx3);

    }

    public void mutiplication() {

        int arr1[][] = mtx1.getMatrix();
        int[][] arr2 = mtx2.getMatrix();
        int[][] arr3 = new int[mtx1.getRow()][mtx2.getColumn()];
        for (int i = 0; i < mtx1.getRow(); i++) {
            for (int j = 0; j < mtx2.getColumn(); j++) {
                arr3[i][j] = 0;
                for (int k = 0; k < arr3.length; k++) {
                    arr3[i][j] = arr3[i][j] + arr1[i][k] * arr2[k][j];
                }
            }
        }
        Matrix mtx3 = new Matrix(arr3, mtx1.getRow(), mtx2.getColumn());

        printMatrix(mtx1);
        
        System.out.println('*');
        printMatrix(mtx2);
        System.out.println("=");
        printMatrix(mtx3);
    }

}
