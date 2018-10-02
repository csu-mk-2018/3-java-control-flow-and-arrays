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
        if (arr == null || arr.length == 0)
            return arr;
        int number = 0;
        int index = 0;
        for (int element : arr)
            if (element >= 1000)
                number++;
        int[] result = new int[arr.length-number];
        for (int variable : arr)
            if (variable <= 1000) {
                result[index] = variable;
                index++;
            }
        return result;
    }

}