package day61coding;

import java.util.Scanner;

public class Day61Coding {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Kelipatan dari: ");
        int m = s.nextInt();
        System.out.printf("Cetak kelipatan %d dari 1 sampai ", m);
        int n = s.nextInt();
        int M = m;
        for (int i = 0; i < n; i++) {
            System.out.println(m);
            m += M;
        }
    }
    
}
