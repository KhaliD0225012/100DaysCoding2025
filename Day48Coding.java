package day48coding;

import java.util.Scanner;

public class Day48Coding {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        double b1 = s.nextDouble();
        System.out.print("Masukkan operator: ");
        char o = s.next().charAt(0);
        System.out.print("Masukkan bilangan: ");
        double b2 = s.nextDouble();
        
        double h;
        switch (o) {
            case '+':
                h = b1+b2;
                break;
            case '-':
                h = b1-b2;
                break;
            case '*':
                h = b1*b2;
                break;
            case '/':
                h = b1/b2;
                break;
            case '%':
                h = b1%b2;
                break;
            default:
                System.out.println("\nOperator tidak dikenal!");
                return;
        }
        System.out.printf("\n%.2f %c %.2f = %.2f\n", b1, o, b2, h);
    }
    
}
