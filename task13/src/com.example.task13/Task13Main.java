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
        if (arr !=null) {
            int newArrLen = 0;
            for (int val : arr) {
                if (val < 1000) {
                    newArrLen++;
                }
            }

            int newArr[] = new int[newArrLen];
            int count = 0;
            for (int val : arr) {
                if (val < 1000) {
                    newArr[count] = val;
                    count++;
                }
            }

            return newArr;
        }
        else {
            return null;
        }
    }

}