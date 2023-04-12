package Home_Work_6_30_03;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Задача 1.

        Scanner scanner10 = new Scanner(System.in);
        String[] srings = new String[50];
        String array;
        int g = 0;
        System.out.println("Введите строки: (пустая строка - конец ввода):");
        do {
            srings[g] = scanner10.nextLine();
            srings[g] = srings[g].toUpperCase();
            array = srings[g];
            if (srings[g].length() % 2 == 1) {
                srings[g] = srings[g].concat(array);
            }
            srings[g] = srings[g].concat(array);
            g++;
        } while (!Objects.equals(srings[g - 1], "") && g < 50);
        System.out.println("Полученные слова:");
        for (int j = 0; j < g; j++) {
            System.out.println(srings[j]);
        }

        // Задача 2.
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 5 строк: ");
        String[] line1 = new String[5];
        String line = in.nextLine();
        String minLine = line;
        String maxLine = line;
        while (!line.isEmpty()) {
            if (minLine.length() > line.length()) {
                minLine = line;
            } else if (maxLine.length() < line.length()) {
                maxLine = line;
            }
            line = in.nextLine();
        }
        System.out.println("Строка с максимальной длиной \"" + maxLine + "\" - длина: " + maxLine.length());
        System.out.println("Строка с минимальной длиной \"" + minLine + "\" - длина: " + minLine.length());
    }

        // Задача 3.

        Scanner scan = new Scanner(System.in);
        String[] line5 = new String[10];
        System.out.println("Введите 8 строк: ");
        for (int h = 0; h < 8; h++) {
            line5[h] = scan.nextLine();
        }
        System.out.println("Содержимое массива в обратном порядке: ");
        for (int h = line5.length - 1; h >= 0; h--) {
            System.out.println(line5[h]);
        }

        // Задача 4.
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

        // Задача 5.

        String[] strings = new String[6];
        System.out.println("Введите 6 строк: ");
        Scanner scanner = new Scanner(System.in);
        for (int v = 0; v < strings.length; v++) {
            strings[v] = scanner.nextLine();
        }
        for (int v = 0; v < strings.length; v++) {
            for (int l = 0; l < strings.length; l++) {
                if (v != l && strings[v] != null) {
                    if (strings[v].equals(strings[l])) {
                        strings[v] = null;
                    }
                }
            }
        }
        System.out.println("Массив без повторяющихся строк:");
        for (String string : strings) {
            System.out.println(string);
        }
    }












