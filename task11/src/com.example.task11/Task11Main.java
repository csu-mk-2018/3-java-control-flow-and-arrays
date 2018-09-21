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

    static void swap(int[] arr) {
        if (arr != null) {
            if (arr.length > 0) {
                int min = Integer.MAX_VALUE;
                int numMin = 0;
                for (int i = 0; i < arr.length; ++i) {
                    if (arr[i] <= min) {
                        min = arr[i];
                        numMin = i;
                    }
                }
                int tmp = arr[0];
                arr[0] = arr[numMin];
                arr[numMin] = tmp;
            }
        }
    }
}
