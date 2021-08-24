package com.company;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {12, 45, 8, 2, 90, 46, -23, -82, -3};
        int target = 2;

        int result = searching(arr, target);
        System.out.println(result);
    }

    static int searching(int[] arr, int target) {
        for (int index = 0 ; index < arr.length ; index++) {
            int element = arr[index];

            if(element == target){
                return index;
            }
        }

        return -1;
    }
}