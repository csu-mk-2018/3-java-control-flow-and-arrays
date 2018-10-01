package com.example.task12;

import java.util.Arrays;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void selectionSort(int[] arr) {
        if (arr != null) {
            int i = 0;
            while (i != arr.length) {
                int MinEl = arr[i];
                int MinInd = i;
                for (int j = i; j < arr.length; j++) {
                    if (arr[j] < MinEl) {
                        MinEl = arr[j];
                        MinInd = j;
                    }
                }
                int tmp = arr[i];
                arr[i] = MinEl;
                arr[MinInd] = tmp;
                i++;
            }
        }
    }
}