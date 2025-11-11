package day65coding;

import java.util.Scanner;

public class Day65Coding {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        int n = 1;
        System.out.printf("%d! = ", b, b);
        while (b > 0) {
            System.out.printf("%d x ", b);
            n *= b;
            b--;
        }
        System.out.println("\b\b= " + n);
    }

}
