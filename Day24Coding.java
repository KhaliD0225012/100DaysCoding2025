package day24coding;

import java.util.Scanner;

public class Day24Coding {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan Panjang Jari-jari\t: ");
        double r = in.nextDouble();
        double area = r*r*Math.PI;
        
        System.out.printf("Luas Lingkaran adalah\t\t: %.2f\n", area);
        
    }
    
}
