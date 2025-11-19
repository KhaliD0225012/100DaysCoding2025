package day73coding;

import java.util.Scanner;

public class Day73Coding {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int total = 0;
        for (;;) {
            System.out.print("Masukkan angka: ");
            int a = s.nextInt();
            if (a >= 0) {
                total += a;
                System.out.println("Total saat ini: " + total);
            } else {
                break;
            }
        }
        System.out.println("Total: " + total);
        
    }
    
}
