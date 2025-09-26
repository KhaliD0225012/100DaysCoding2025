package day19coding;

import java.util.Scanner;

public class Day19Coding {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nilai Variabel Pertama : ");
        long var1 = in.nextLong();
        int var2 = (int)var1;
        short var3 = (short)var2;
        byte var4 = (byte)var3;
        
        System.out.println("Nilai Variabel Pertama\t: " + var1);
        System.out.println("Nilai Variabel Kedua\t: " + var2);
        System.out.println("Nilai Variabel Ketiga\t: " + var3);
        System.out.println("Nilai Variabel Keempat\t: " + var4);
        
    }
    
}
