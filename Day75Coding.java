package day75coding;

import java.util.Scanner;

public class Day75Coding {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama = s.nextLine();
        System.out.printf("\nPanjang nama %d karakter\n", nama.length());
        System.out.println("Uppercase: "+ nama.toUpperCase());
        System.out.println("Lowercase: "+ nama.toLowerCase());
    }
    
}
