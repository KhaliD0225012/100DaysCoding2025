package day23coding;

import java.util.Scanner;

public class Day23Coding {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Menghitung Luas Persegi Panjang");
        
        System.out.print("Masukkan nilai panjang\t: ");
        double panjang = input.nextDouble();
        
        System.out.print("Masukkan nilai lebar\t: ");
        double lebar = input.nextDouble();
                      
        double luas = panjang*lebar;
        
        System.out.printf("Luas Persegi Panjang\t: %.2f\n", luas);
         
    }
    
}
