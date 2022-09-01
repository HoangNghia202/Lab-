package BinarySearch;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public int binarySearch(int arr[], int l, int x, int r) {
        int m = l + (r - l) / 2;
        if (x == arr[m]) {
            return m;
        }

        if (x < arr[m]) {
           return binarySearch(arr, l, x, m-1);
        }

        if (x > arr[m]) {
           return binarySearch(arr, m+1, x, r);
        }
        return -1;

    }

    public void bubbleSort(int arr[]) {
        int temp;
        int i, j;

        boolean swapped = false;
        for (i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public void display(int arr[]) {
        int i;
        System.out.print("[");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]\n");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter number of component of array (n>1): ");
            n = sc.nextInt();
        } while (n < 1);
        int arr[] = new int[n];
        Random generation = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = generation.nextInt();
        }

        Main brs=new  Main();

        System.out.print("input:");
        brs.display(arr);
        brs.bubbleSort(arr);
        System.out.print("Array after sort: ");
        brs.display(arr);
        System.out.print("Enter the number u wanna find in array:");
        int x= sc.nextInt();
        int result= brs.binarySearch(arr, 0, x, n-1);
        if (result>=0) {
            System.out.println(x+" is at position: "+ result);
        } else {
            System.out.println("Cant not find "+ x+" in array");
        }
    }
}
