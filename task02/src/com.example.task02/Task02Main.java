package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(12));
         */
    }

    static String getSeason(int monthNumber) {
        String resultSeason;

        if ((monthNumber >= 1 && monthNumber < 3) || monthNumber == 12)
            resultSeason = "зима";
        else if (monthNumber >= 3 && monthNumber < 6)
            resultSeason = "весна";
        else if (monthNumber >= 6 && monthNumber < 9)
            resultSeason = "лето";
        else if (monthNumber >= 9 && monthNumber < 12)
            resultSeason = "осень";
        else
            resultSeason = "неизвестно";

        return resultSeason;
    }
}