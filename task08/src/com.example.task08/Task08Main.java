package com.example.task08;

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
        long mul = 1;
        for (int i = 0; i < arr.length; i++) {
            mul *= arr[i];
        }
        if(arr.length!=0)
            return mul;
        else
            return 0;
    }

}