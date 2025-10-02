package day25coding;

import java.util.Scanner;

public class Day25Coding {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka\t: ");
        int angka = input.nextInt();
        
        angka++;
        System.out.println("\n==INCREMNT==");
        System.out.println("Nilai Angka\t: " + angka);
        
        angka--;
        angka--;
        System.out.println("\n==DECREMNT==");
        System.out.println("Nilai Angka\t: " + angka);
        
    }
    
}
