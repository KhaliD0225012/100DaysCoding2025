package day20coding;

import java.util.Scanner;

public class Day20Coding {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Bilangan Bulat: ");
        int prim = in.nextInt();
        
        String s1 = String.valueOf(prim);
        String s2 = prim + "";
        String s3 = Integer.toString(prim);
        String s4 = String.format("%d", prim);
        
        System.out.println("\nTipe data primitif\t: " + (prim+1));
        System.out.println("Konversi string 1\t: " + (s1+1));
        System.out.println("Konversi string 2\t: " + (s2+2));
        System.out.println("Konversi string 3\t: " + (s3+3));
        System.out.println("Konversi string 4\t: " + (s4+4));
        
    }
    
}
