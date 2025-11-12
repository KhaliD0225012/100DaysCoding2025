package day66coding;

import java.util.Scanner;

public class Day66Coding {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        for (double i = 1; i <= a/4; i++) {
            for (double j = 2; j <= a; j+=1.5) {
                String b = (j%2==0)? "o":" ";
                System.out.print(b);
            }
            System.out.println("");
        }
        
    }
    
}
