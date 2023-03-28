package HomeWork_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Задача 1.

        int m = 2;
        int n = 4;

        for (int i = 0; i < m; i++) {
            System.out.println();
            for (int g = 0; g < n; g++) {
                System.out.print("8");
                ;
            }
        }
        System.out.println();

        // Задача 2.
        for (int t = 0; t < 10; t++) {
            System.out.println();
            for (int r = 0; r <= t; r++) {
                System.out.print("8");
            }
        }
        System.out.println();

        // Задача 3.

        Scanner number = new Scanner(System.in);
        int p1 = number.nextInt();
        int p2 = number.nextInt();
        int p3 = number.nextInt();

        if (p1 < p2 && p1 > p3) {
            System.out.print(p1);
        } else if (p2 > p1 && p2 < p3) {
            System.out.print(p2);
        } else
            System.out.print(p3);

        // Задача 4.

        int q = 1;
        int w = 1;
        while (q <= 10) {
            System.out.print( q + " ");
            while (w <= 9) {
                w++;
                System.out.print( q * w + " ");
            }
            q++;
            w = 1;
            System.out.println(" ");


            // Задача 5.
            Scanner na = new Scanner(System.in);
            String name = na.nextLine();

            int Day = na.nextInt();
            int Month = na.nextInt();
            int Year = na.nextInt();

            System.out.printf("Меня зовут %s", name);
            System.out.println(" Я родился " + Day + "." + Month + "." + Year + ".");

        }

    }
}






































