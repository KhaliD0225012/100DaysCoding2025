package day22coding;

import java.util.Scanner;

public class Day22Coding {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan Panjang Sisi : ");
        double sisi = in.nextDouble();
        
        System.out.printf("Luas Persegi dengan Sisi %.2f cm adalah %.2f cm\n\n", sisi, (sisi*sisi));
        
    }
    
}
