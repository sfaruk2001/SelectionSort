package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {2, 8, 5, 3, 9, 4, 1};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //sorts in ascending
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int minInd = i;
            for (int j = i +1; j < arr.length; j++) {
                if (arr[j] < arr[minInd]) {
                    minInd = j;
                }
            }

            int temp = arr[minInd];
            arr[minInd] = arr[i];
            arr[i] = temp;
        }
    }

    //sorts in descending
    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int maxInd = i;
            for (int j = i +1; j < arr.length; j++) {
                if (arr[j] > arr[maxInd]) {
                    maxInd = j;
                }
            }

            int temp = arr[maxInd];
            arr[maxInd] = arr[i];
            arr[i] = temp;
        }
    }

}

