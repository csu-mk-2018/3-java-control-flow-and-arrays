package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void selectionSort(int[] arr) {
        if(arr != null && arr.length != 0){
            int indexMinElement, tmp;
            for(int j = 0; j < arr.length; j++){
                indexMinElement = j;
                for(int i = j + 1; i < arr.length; i++){
                    if(arr[indexMinElement] > arr[i]){
                        indexMinElement = i;
                    }
                }
                tmp = arr[j];
                arr[j] = arr[indexMinElement];
                arr[indexMinElement] = tmp;
            }
        }
    }

}