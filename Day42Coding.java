package day42coding;

import java.util.Scanner;

public class Day42Coding {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan nama karyawan: ");
        String nama = s.nextLine();
        System.out.print("Gaji kotor karyawan: ");
        double gk = s.nextDouble();
        
        double pajak, gb;
        if (gk<=60000000){
            pajak = 5;
        } else if (gk>6000000 && gk <= 25000000){
            pajak = 15;
        } else if (gk>25000000 && gk <= 50000000){
            pajak = 25;
        } else if (gk>50000000 && gk <= 500000000){
            pajak = 30;
        } else {
            pajak = 35;
        }
        double potongan = (pajak*gk)/100;
        gb = gk - potongan;
        
        System.out.printf("%-20s: %s\n", "Nama Karyawan", nama);
        System.out.printf("%-20s: Rp%.1f\b\b\n", "Gaji kotor", gk);
        System.out.printf("%-20s: %.1f\b\b%c\n", "Pajak penghasilan", pajak, '%);
        System.out.printf("%-20s: Rp%.1f\b\b\n", "Gaji bersih", gb);
    }
    
}
