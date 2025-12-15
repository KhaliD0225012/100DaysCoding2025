package day99coding;

import java.util.Scanner;

public class Day99Coding {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 2; i <= n; i++) {
            boolean p = true;
            for (int j = 2; j <= i-1; j++) {
                if (i%j == 0) {
                    p = false;
                }
            }
            if (p) {
                System.out.print(i+" ");
            }
        }
        System.out.println("");
        
    }
    
}
