package day58coding;

import java.util.Scanner;

public class Day58Coding {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("\n1-N");
        for (int i = 1; i <= n; i++) {
            System.out.printf("%-2d ", i);
            if (i%10 == 0){
                System.out.println("");
            }
        }
        System.out.println("\n\nN-1");
        for (int i = n; i >= 1; i--) {
            System.out.printf("%2d ", i);
            if (i%10 == 1){
                System.out.println("");
            }
        }
        System.out.println("");
    }
    
}
