package day97coding;

import java.util.Scanner;

public class Day97Coding {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi: ");
        double side = s.nextDouble();
        System.out.println("Luas persegi: "+ area(side));
        
    }
    static double area(double sisi){
        double luas = sisi*sisi;
        return luas;
    }
    
}
