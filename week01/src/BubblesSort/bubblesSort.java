package BubblesSort;

import java.util.Random;
import java.util.Scanner;

public class bubblesSort {
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
        Scanner sc= new Scanner(System.in);
        int n;
       do {
           System.out.print("Enter number of component of array (n>1): ");
           n=sc.nextInt();
       } while (n<1);
       int arr[]= new int [n];
       Random generation= new Random();
       for (int i = 0; i < arr.length; i++) {
           arr[i]=generation.nextInt();
       }
        bubblesSort bls = new bubblesSort();
        System.out.println("Mang du lieu dau vao: ");
        bls.display(arr);
        System.out.println("-----------------------------");
       bls.bubbleSort(arr);
        System.out.println("-----------------------------");
        System.out.println("\nMang sau khi da sap xep: ");
       bls.display(arr);
    }
}

