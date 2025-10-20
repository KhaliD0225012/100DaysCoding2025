package day43coding;

import java.util.Scanner;

public class Day43Coding {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat: ");
        int b = s.nextInt();
        
        if (b%3==0 && b%5==0){
            System.out.printf("%d adalah kelipatan 3 dan 5\n", b);
        } else if (b%3==0){
            System.out.printf("%d adalah kelipatan 3\n", b);
        } else if (b%5==0){
            System.out.printf("%d adalah kelipatan 5\n", b);
        } else {
            System.out.printf("%d bukan kelipatan 3 atau 5\n", b);
        }
        
    }
    
}
