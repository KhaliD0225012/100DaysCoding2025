package day17coding;

import java.util.Scanner;

public class Day17Coding {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("==Mencari Modulus==\n  ");
        
        System.out.print("Masukkan angka: ");
        int angka1 = in.nextInt();
        System.out.print("Masukkan angka: ");
        int angka2 = in.nextInt();
        
        int sisa;
        
        if (angka2 == 0){
            System.out.println("\nERROR!!");
        } else {
            sisa = angka1 % angka2;
            System.out.printf("\n%d Modulo %d adalah: %d\n", angka1, angka2, sisa);
            
        }
        
    }
    
}
