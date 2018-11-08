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
        if (a > b && a > c && a > d){
            return a;
        }
        else if (b > a && b > c && b > d){
            return b;
        }
        else if (c > a && c > b && c > d){
            return c;
        }
        else if (d > a && d > b && d > c){
            return d;
        }
        else if (a == b && a == c && a == d){
            return a;
        }
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        return 0;
    }

}