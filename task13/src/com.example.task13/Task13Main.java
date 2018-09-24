package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr != null) {
            int arr2_length = 0;
            for (int i : arr) {
                if (i <= 1000)
                    arr2_length++;
            }
            int[] arr2 = new int[arr2_length];
            int j = 0;
            for (int i : arr) {
                if (i <= 1000) {
                    arr2[j] = i;
                    j++;
                }
            }
            return arr2;
        }
        return null;
    }

}