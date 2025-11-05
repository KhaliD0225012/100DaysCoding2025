package day59coding;

import java.util.Scanner;

public class Day59Coding {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("\nGANJIL");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.printf("%-2d ", i);
                if (i%20 == 19){
                    System.out.println("");
                }
            }
        }
        System.out.println("\n\nGENAP");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.printf("%-2d ", i);
                if (i%20 == 0){
                    System.out.println("");
                }
            }
        }
        System.out.println("");

    }

}
