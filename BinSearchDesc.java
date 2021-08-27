package com.company;

import java.util.Scanner;

public class BinSearchDesc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {420, 369, 139, 80, 69, 41, 6, 1, -4, -10, -113}; //Descending
        int target = 1;

        int result = binsearch(arr, target);

        System.out.println(result);
    }

    static int binsearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int middle = start + (end - start) / 2;

            if(target < arr[middle]){
                start = middle + 1;
            }
            else if(target > arr[middle]){
                end = middle - 1;
            }
            else{
                return middle;
            }
        }

        return -1;
    }
}