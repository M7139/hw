package com.homework;

import java.util.Arrays;

public class RotateArray {

    public static void rotate(int[] arr, int d, int n) {
        if (n == 0) {
            return;
        }

        d = d % n;

        int[] temp = new int[d];

        // Save the first d elements.
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        // Move the remaining elements to the left.
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        // Place the saved elements at the end.
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        rotate(arr1, 2, arr1.length);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {10, 20, 30};
        rotate(arr2, 5, arr2.length);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {1, 2, 3, 4};
        rotate(arr3, 0, arr3.length);
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = {1, 2, 3};
        rotate(arr4, 3, arr4.length);
        System.out.println(Arrays.toString(arr4));

        int[] arr5 = {};
        rotate(arr5, 2, arr5.length);
        System.out.println(Arrays.toString(arr5));
    }
}