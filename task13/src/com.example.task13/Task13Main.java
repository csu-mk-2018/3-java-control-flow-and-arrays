package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {9, 1100, 7, 8};
        arr = removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null || arr.length == 0)
            return arr;

        int newSize = 0, i = 0;

        for (int element : arr)
            if (element <= 1000)
                newSize++;

        int[] res = new int[newSize];

        for (int element : arr)
            if (element <= 1000) {
                res[i] = element;
                i++;
            }
        return res;
    }

}