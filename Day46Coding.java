package day46coding;

import java.util.Scanner;

public class Day46CodingJava {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("=== MENU ===");
        System.out.println("1. Ayam Crispy   Rp10.000");
        System.out.println("2. Ayam Gebrek   Rp11.000");
        System.out.println("3. Nasi Ayam     Rp12.000");
        System.out.println("4. Nasi Goreng   Rp13.000");
        System.out.println("5. Mi Goreng     Rp15.000");
        System.out.print("Pilihan: ");
        int p = s.nextInt();
        
        switch (p) {
            case 1:
                System.out.println("\nBayar Rp10.000");
                System.out.println("Silakan tunggu di meja");
                break;
            case 2:
                System.out.println("\nBayar Rp11.000");
                System.out.println("Silakan tunggu di meja");
                break;
            case 3:                
                System.out.println("\nBayar Rp12.000");
                System.out.println("Silakan tunggu di meja");
                break;
            case 4:
                System.out.println("\nBayar Rp13.000");
                System.out.println("Silakan tunggu di meja");
                break;
            case 5:
                System.out.println("\nBayar Rp15.000");
                System.out.println("Silakan tunggu di meja");
                break;     
            default:
                throw new AssertionError();
        }
        
    }
    
}
