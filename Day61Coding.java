package day61coding;

import java.util.Scanner;

public class Day61Coding {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Kelipatan dari: ");
        int m = s.nextInt();
        System.out.printf("Cari kelipatan %d dari 1 sampai ", m);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i%m == 0){
                System.out.println(i);
            }
        }
        
    }
    
}
