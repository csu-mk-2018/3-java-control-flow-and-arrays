package com.example.task08;

import java.util.Arrays;

public class Task08Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = new int[2];
        arr[0] = 2;
        arr[1] = 3;
        System.out.println(mult(arr));
         */
    }

    static long mult(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей

        long mul = arr.length > 0 ? 1 : 0;

        for (int i = 0; i < arr.length; i++)
            mul *= arr[i];

        return mul;

    }

}
