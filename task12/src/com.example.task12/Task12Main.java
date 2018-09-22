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

    static int[] getMinElementAndIndex (int[] arr, int startIndex) {
        int min = Integer.MAX_VALUE;
        int index = 0;

        for (int i = startIndex; i < arr.length; i++)
            if (min >= arr[i]) {
                min = arr[i];
                index = i;
            }

        return new int[]{min, index};
    }

    static void selectionSort(int[] arr) {

        int[] result;
        int temp;

        if (arr == null || arr.length == 0)
            return;

        for (int i = 0; i < arr.length; i++){
            result = getMinElementAndIndex(arr, i);
            temp = arr[i];
            arr[i] = result[0];
            arr[result[1]] = temp;
        }
    }

}