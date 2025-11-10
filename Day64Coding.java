package day64coding;

import java.util.Scanner;

public class Day64Coding {
 
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Basis ");
        int m = s.nextInt();
        System.out.printf("%d pangkat ", m);
        int n = s.nextInt();
        int h = 1;
        for (int i = 1; i <= n; i++) {
            h *= m;
        }
        System.out.println(h);
    }
    
}
