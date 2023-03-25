package lesson_4;

public class Main {
    public static void main(String[] args) {


        // Объявление переменной i - означает нижний порог от которого мы будем отсчитывать
        // Вторая часть - условие выхода из цикла
        // Третья часть - инерементирование переменной i
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Hello world!" + i);
//        }

        int sum = 0;
        for (int i = 10; i<= 50; i+=2) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);






    }
}
