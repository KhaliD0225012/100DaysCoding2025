package day91coding;

import java.util.Scanner;

public class Day91Coding {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama = s.nextLine();
        System.out.print("Masukkan tahun lahir: ");
        int tahun = s.nextInt();
        
        System.out.print("NAMA SAYA: ");
        nama(nama);
        System.out.printf("UMUR SAYA %d TAHUN\n", umur(tahun));
        
        
    }
    static void nama(String nama){
        System.out.println(nama.toUpperCase());
    }
    static int umur(int umur){
        umur = 2025-umur;
        return umur;
    }
    
}
