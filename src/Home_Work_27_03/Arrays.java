package Home_Work_27_03;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        // Задача 1.

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

        // Задача 2.

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

        // Задача 3.

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

        // Задача 4.

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

        // Задача 5.

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

        // Задача 6.

        Scanner array5 = new Scanner(System.in);
        int[] list10 = new int[20];
        System.out.println("Введите 20 чисел: ");

        for (int i = 0; i < list10.length; i++) {
            list10[i] = array5.nextInt();
        }
        int max1 = list10[0];
        for (int j : list10) {
            if (max1 < j)
                max1 = j;
        }
        int min1 = max1;
        for (int j : list10) {
            if (min1 > j)
                min1 = j;
        }
        System.out.println("Максимальное и минимальное числа:");
        System.out.print(max1 + " " + min1);


        // Задача 7.
        Scanner number1 = new Scanner(System.in);
        int[] arraysorting = new int[20];
        System.out.println("Введите 20 чисел: ");
        for (int i = 0; i < arraysorting.length; i++) {
            arraysorting[i] = number1.nextInt();
        }
        int sort;
        System.out.println("Вывод чисел в убывающем порядке:");
        for (int i = 0; i < arraysorting.length - 1; i++) {
            for (int w = 1; w < arraysorting.length - i; w++) {
                if (arraysorting[w - 1] > arraysorting[w]) {
                    sort = arraysorting[w];
                    arraysorting[w] = arraysorting[w - 1];
                    arraysorting[w - 1] = sort;
                }
            }
        }
        for (int i = arraysorting.length - 1; i >= 0; i--) {
            System.out.println(arraysorting[i] + " ");
        }
    }
}
