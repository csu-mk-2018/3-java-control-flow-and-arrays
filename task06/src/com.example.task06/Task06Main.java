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
        if(a > b)
        {
            if(a > c)
            {
                if(a > d)
                {
                    return a;
                }
                else
                {
                    return d;
                }
            }
            else if(c > d)
            {
                return c;
            }
            else
            {
                return d;
            }
        }
        else if(b > c)
        {
            if(b > d)
            {
                return b;
            }
            else
            {
                return d;
            }
        }
        else
        {
            if(c > d)
            {
                return c;
            }
            else
            {
                return d;
            }
        }
    }

}