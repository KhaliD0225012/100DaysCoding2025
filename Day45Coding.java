package day45coding.java;

import java.util.Scanner;

public class Day45CodingJava {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Pilih: ");
        System.out.println("1. Mabar");
        System.out.println("2. Tidur");
        System.out.println("3. Belajar");
        System.out.print("Pilihan: ");
        int p = s.nextInt();
        
        switch (p) {
            case 1:
                System.out.println("\nKamu mabar dan tidak belajar sehingga gagal ujian.");
                break;
            case 2:
                System.out.println("\nKamu tidur dan tidak belajar sehingga gagal ujian.");
                break;
            case 3:
                System.out.println("\nKamu belajar sehingga bisa lulus ujian dan mabar setelahnya.");
                break;
                
            default:
                throw new AssertionError();
        }
        
    }
    
}
