package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {

        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {

        int min, temp;
        if (arr != null) {
            if (arr.length > 0) {
                for (int j = 0; j < arr.length - 1; j++) {
                    min = j;
                    for (int i = j + 1; i < arr.length; i++) {
                        if (arr[i] < arr[min])
                            min = i;
                    }

                    // Swap the values
                    temp = arr[min];
                    arr[min] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}