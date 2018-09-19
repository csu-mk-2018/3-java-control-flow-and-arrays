package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static int numMin(int[] arr) {
        int minEl = arr[0];
        int minIndex = 0;

        for (int i = 0; i < arr.length; ++i) {
            if (minEl > arr[i]) {
                minEl = arr[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    static void swap(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (arr == null || arr.length == 0)
            return;

        int tmp = arr[0];
        int indexOfMin = numMin(arr);

        arr[0] = arr[indexOfMin];
        arr[indexOfMin] = tmp;
    }

}
