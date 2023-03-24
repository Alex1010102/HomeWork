package HomeWork;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // Задача 4. Закомментируй часть кода, чтобы на экран вывелось сообщение "sum = 12"
        int a = 3;
        //int a = 10;
        int b = 6;
        //int b = 12;
        //int sum = 1 + a + b;
        //int sum = 2 + a + b;
        int sum = 3 + a + b;
        //int sum = 4 + a + b;
        System.out.println("sum = " + sum);


        // It was added to second commit ///

        int k = 90;
        k *= 8;
        k -= 100;
        System.out.println(k);

        int age = 10;

        if (age > 13) {
            System.out.println("Your age is ok");
        } else if (age < 13) {
            System.out.println("No you can't go to the film");
        }

        int mathRate = 7;

        if (mathRate == 5) {
            System.out.println("Отлично");
        } else if (mathRate == 4) {
            System.out.println("Хорошо");
        } else if (mathRate == 3) {
            System.out.println("Удовлетворительно");
        } else if (mathRate == 2) {
            System.out.println("Плохо");
        } else if (mathRate == 1) {
            System.out.println("Отвратительно");
        } else {
            System.out.println("Такой оценки не знаю");
        }

//        int mathRate1 = 2;
//        mathRate1 /= 2;
//
//
//        switch (mathRate1) {
//            case 5:
//                System.out.println("Отлично");
//                break;
//            case 4:
//                System.out.println("Хорошо");
//                break;
//            case 3:
//                System.out.println("Удовлетворительно");
//                break;
//            case 2:
//                System.out.println("Плохо");
//                break;
//            case 1:
//                System.out.println("Отвратительно");
//                break;
//            default:
//                System.out.println("Такой оценки не знаю");
//                break;
//        }



        Scanner scan = new Scanner(System. in);
        int fromConsole = scan.nextInt();

        switch (fromConsole) {
            case 30:
                System.out.println("Погода сегодня жарковата");
                break;
            case 15:
                System.out.println("Погода сегодня теплая");
                break;
            case -10:
                System.out.println("Погода сегодня холодная");
                break;
            default:
                System.out.println("Ощущения по погоде неизвестны, прийдется выйти на улицу");
                break;
        }





    }
}
