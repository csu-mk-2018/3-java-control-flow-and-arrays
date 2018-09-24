package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void selectionSort(int[] arr) {
        if (arr != null && arr.length > 0) {
            for (int min = 0; min < arr.length - 1; min++) {
                int least = min;
                for (int j = min + 1; j < arr.length; j++) {
                    if (arr[j] < arr[least]) {
                        least = j;
                    }
                }
                int tmp = arr[min];
                arr[min] = arr[least];
                arr[least] = tmp;
            }
        }
    }

}