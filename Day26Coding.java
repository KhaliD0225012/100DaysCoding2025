package day26coding;

import java.util.Scanner;

public class Day26Coding {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan Angka: ");
        int num1 = in.nextInt();
        System.out.print("Masukkan Angka: ");
        int num2 = in.nextInt();
        
        System.out.printf("Nilai penjumlahan = %d\n", num1 += num2);
        System.out.printf("Nilai pengurangan = %d\n", num1 -= num2);
        System.out.printf("Nilai perkalian   = %d\n", num1 *= num2);
        System.out.printf("Nilai pembagian   = %d\n", num1 /= num2);
        System.out.printf("Sisa pembagian    = %d\n", num1 %= num2);
        
    }
    
}
