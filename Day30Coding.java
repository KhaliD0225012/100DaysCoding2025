package day30coding;

import java.util.Scanner;

public class Day30Coding {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Angka\t: ");
        int a1 = s.nextInt();
        System.out.print("Masukkan Angka\t: ");
        int a2 = s.nextInt();
        System.out.println("Angka Pertama tidak lebih kecil\t: " + (a1>=a2));
        System.out.println("Angka Kedua tidak lebih kecil\t: " + (a1<=a2));
        
    }
    
}
