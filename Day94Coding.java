package day94coding;

import java.util.Scanner;

public class Day94Coding {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama = s.nextLine();
        out(nama);
    }
    static void out(String nama){
        System.out.println("Halo "+ nama);
    }
    
}
