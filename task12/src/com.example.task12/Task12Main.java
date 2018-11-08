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

    static void selectionSort(int[] arr) {

        int min, toMem;
        if (arr != null) {
            if (arr.length > 0) {
                for (int j = 0; j < arr.length - 1; j++) {
                    min = j;
                    for (int i = j + 1; i < arr.length; i++) {
                        if (arr[i] < arr[min])
                            min = i;
                    }
                    toMem = arr[min];
                    arr[min] = arr[j];
                    arr[j] = toMem;
                }
            }
        }
    }

}
//todo напишите здесь свою корректную реализацию этого метода, вместо существующей


