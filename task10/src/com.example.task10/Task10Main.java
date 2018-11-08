package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {0, 0, 0, 0};
        System.out.println(numMin(arr));

    }

    static int numMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i < arr.length; ++i){
            if (arr[i] < min){
                min = arr[i];
                minIndex = i;
            }
        }


        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        return minIndex;
    }

}