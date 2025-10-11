package day34coding;

import java.util.Scanner;

public class Day34Coding {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        double a = s.nextDouble();
        System.out.print("Masukkan bilangan: ");
        double b = s.nextDouble();
        
        System.out.println("==MINIMAL 2 JAWABAN BENAR==");
        
        System.out.print("Hasil penjumlahan : ");
        double p = s.nextDouble();
        System.out.print("Hasil pengurangan : ");
        double m = s.nextDouble();
        System.out.print("Hasil perkalian   : ");
        double t = s.nextDouble();
        
        boolean fail = !((p==a+b&&m==a-b)||(p==a+b&&t==a*b)||(m==a-b&&t==a*b));
        System.out.println("==PEMERIKSAAN==");
        System.out.printf("Anda gagal : %b\n", fail);
        
    }
    
}
