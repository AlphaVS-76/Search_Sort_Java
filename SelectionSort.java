package com.company;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            int last = arr.length - i - 1;

            int max = large(arr, 0, last);

            swapping(arr, max, last);
        }
    }

    static int large(int[] arr, int start, int end) {
        int l = start;
        for (int i = 1; i <= end; i++) {
            if (arr[i] > arr[l]) {
                l = i;
            }
        }
        return l;
    }

    static void swapping(int[] arr, int f, int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}
