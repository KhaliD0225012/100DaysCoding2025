package day28coding;

import java.util.Scanner;

public class Day28Coding {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int a = in.nextInt();
        System.out.print("Masukkan angka : ");
        int b = in.nextInt();
        
        System.out.println("\nAngka pertama dan kedua nilainya sama: " + (a == b));
        System.out.println("Angka pertama dan kedua nilainya beda: " + (a != b));
               
    }
    
}
