package Home_Work_5_27_03;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        /** Задача 1. 1. Создать массив на 10 строк. Ввести с клавиатуры 8 строк и сохранить их в массив.
         * Вывести содержимое всего массива (10 элементов) на экран в обратном порядке.
         * Каждый элемент - с новой строки.
         * */

        Scanner sc = new Scanner(System.in);
        String [] list = new String [10];
        System.out.println("Введите 8 строк: ");
        for (int i = 0; i < 8; i++) {
            list [i] = sc.nextLine();
        }
        System.out.println("Содержимое массива в обратном порядке: ");
        for (int i = list.length - 1; i >= 0; i--){
            System.out.println(list[i]);
        }

        /** Задача 2. Создай массив на 10 чисел. Считай с консоли 10 чисел и заполни ими массив
         * Найти максимальное число из элементов массива.
         * */
        Scanner number = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Введите 10 чисел: ");
        for (int i = 0; i < 10; i++) {
            array[i] = number.nextInt();
        }
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)

                max = array[i];
        }
        System.out.println("Максимальное число из элементов массива: " + max);

        /** Задача 3. Создать массив на 10 строк. Создать массив на 10 чисел.
         * Ввести с клавиатуры 10 строк, заполнить ими массив строк. В каждую ячейку массива чисел
         * записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим
         * индексом из массива чисел.
         * */
        Scanner numbers = new Scanner(System.in);
        int[] numbe = new int[10];
        String[] str = new String[10];
        System.out.println("Введите 10 строк:");
        for (int i = 0; i < str.length; i++) {
            String s = numbers.nextLine();
            str[i] = s;
        }
        System.out.println("Вывести содержимое массива чисел:");
        for (int i = 0; i < numbe.length; i++) {
            numbe[i] = str[i].length();
        }
        for (int j : numbe) {
            System.out.println(j);
        }



        /** Задача 4.Создать массив на 10 чисел. Ввести с клавиатуры 10 чисел и записать их в массив.
         * Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.
         * * */
        Scanner numb = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Введите 10 чисел: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = numb.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            int r = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = r;
        }
        System.out.println("Элементы массива в обратном порядке:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        /** Задача 5. Создать массив на 20 чисел. Ввести в него значения с клавиатуры. Создать два массива на 10 чисел
         * каждый. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину
         * вовторой маленький. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
         * */

        Scanner scanner = new Scanner(System.in);
        int [] array1 = new int[20];
        System.out.println ("Введите 20 чисел: ");
        int [] array2 = new int[10];
        int [] array3 = new int[10];

        Scanner scanner1 = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner1.nextInt();
        }
        System.out.println ("Вывести второй маленький массив на экран: ");

        for (int i = 0; i < array2.length; i++) {
            array2 [i] = array1[i];
            array3 [i] = array1[i + 10];
            System.out.println(array3[i]);
        }

        /** Задача 6. Создать массив на 20 чисел. Заполнить его числами с клавиатуры.
         * Найти максимальное и минимальное числа в массиве.Вывести на экран максимальное и минимальное
         * числа через пробел.
         * */

        Scanner array5 = new Scanner(System.in);
        int [] list1 = new int[20];
        System.out.println ("Введите 20 чисел: ");

        for (int i = 0; i < list.length; i++) {
            list1[i] = array5.nextInt();}
                int max1 = list1 [0];
        for (int i = 0; i < list.length; i++) {
            if (max1 < list1[i])
                max1 = list1[i];
        }
        int min1 = max1;

        for (int i = 0; i < list.length; i++){
            if (min1 > list1[i])
                min1 = list1[i];
        }
        System.out.println("Максимальное и минимальное числа:");
        System.out.print(max1 +  " "   + min1);


        /** Задача 7. Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
         * */
        Scanner number1 = new Scanner(System.in);
        int[] arraysorting = new int[20];
        System.out.println("Введите 20 чисел: ");
        for (int i = 0; i < 20; i++) {
            arraysorting[i] = number1.nextInt();
        }
        sorting (arraysorting);
        for (int x : arraysorting) {
            System.out.println(x);
        }
    }
        public static void sorting (int  [] array) {
            int numbers;
            System.out.println("Вывод чисел в убывающем порядке:");
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        numbers = array[j];
                        array[j] = array[i];
                        array[i] = numbers;

                    }
                }
            }
        }
}