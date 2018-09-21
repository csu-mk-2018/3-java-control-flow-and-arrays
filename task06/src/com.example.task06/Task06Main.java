package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getMax(1, 2, 3, 4));
         */
    }

    static int getMax(int a, int b, int c, int d) {
        int max = Integer.MIN_VALUE;
        max = Integer.max(a, max);
        max = Integer.max(b, max);
        max = Integer.max(c, max);
        max = Integer.max(d, max);
        return max;
    }
}
