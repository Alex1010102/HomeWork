package lesson_1;

public class Main {
    public static void main(String[] args) {

        // Задача 1. Дано: Хитрый бухгалтер разделил 5 рублей на 2 кассы. Сколько рублей лежит в каждой кассе ?
        double rub = 5;
        int kass = 2;
        double res = rub / kass;
        System.out.println("Result in each cashmachine "+ res);

        // Задача 2. Дано: Стороны квадрата a = 50, b = 20. Найти площадь.
        int a = 50;
        int b = 20;
        int s = a * b;
        System.out.println("Square is " + s);

        // Задача 3. Дано: Голодный Вася съедает за 9 минут 3 банана, а сытый за 15 минут,
        // насколько быстрее голодный Вася съедает один банан?
        int hungryTime = 9;
        int fullTime = 15;
        int bananas = 3;
        int hungryBananasPerMinute = hungryTime / bananas;
        int fullBananasPerMinute = fullTime / bananas;
        int diff = fullBananasPerMinute - hungryBananasPerMinute;
        System.out.println("The difference is " + diff);

    }
}