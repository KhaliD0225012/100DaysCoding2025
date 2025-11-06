package day60coding;

import java.util.Scanner;

public class Day60Coding {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("\nGANJIL");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.printf("%-2d ", i);
            }
        }
        System.out.println("\n\nGENAP");
        for (int i = n; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.printf("%-2d ", i);
            }
        }
        System.out.println("");

    }

}
