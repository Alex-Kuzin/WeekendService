package ru.netology;

import ru.netology.javaqa.javaqamvn.services.CalcWeekend;

public class Main {
    public static void main(String[] args) {

CalcWeekend service = new CalcWeekend();
        int calcCount = (int) service.calculate(100_000, 60_000, 150_000);
        System.out.println("Количество месяцев отдыха в следующем году: " + calcCount);


    }
}