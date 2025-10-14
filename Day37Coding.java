package day37coding;

import java.util.Scanner;

public class Day37Coding {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat: ");
        int b = s.nextInt();
        if (b%2==0){
            System.out.printf("%d adalah bilangan GENAP.\n", b);
        } else {
            System.out.printf("%d adalah bilangan GANJIL.\n", b);
        }
        
    }
    
}
