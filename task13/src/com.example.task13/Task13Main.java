package com.example.task13;

import com.sun.deploy.util.ArrayUtil;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 1100, 7, 8};
        int [] arr2 =  removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr2));
        */
    }

    static  int getNewSize(int[] arr){

        int size = 0;

        for (int elem:arr) {
            if (elem <= 1000)
                size++;
        }

        return  size;
    }

   static int[] removeMoreThen1000(int[] arr) {

        if (arr == null || arr.length == 0)
            return arr;

        int[] newMass = new int[getNewSize(arr)];

        for (int i = 0, j = 0; i < arr.length; i++)
           if (arr[i] <= 1000){
               newMass[j] = arr[i];
               j++;
           }

        return  newMass;
    }

}