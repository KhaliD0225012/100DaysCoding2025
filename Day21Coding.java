package day21coding;

import java.util.Scanner;

public class Day21Coding {

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        
        System.out.println("MENUKAR NILAI DUA VARIABEL");
        System.out.print("Masukkan Angka\t: ");
        int satu = in.nextInt();
        System.out.print("Masukkan Angka\t: ");
        int dua = in.nextInt();
        
        System.out.println("\n=== SEBELUM AFTER ===");
        System.out.println("Nilai Variabel Pertama\t: " + satu);
        System.out.println("Nilai Variabel Kedua\t: " + dua);
        
        satu = satu + dua;
        dua = satu - dua;
        satu = satu - dua;
        
        System.out.println("\n=== SETELAH BEFORE ===");
        System.out.println("Nilai Variabel Pertama\t: " + satu);
        System.out.println("Nilai Variabel Kedua\t: " + dua);
                
    }
    
}
