package day39coding;

import java.util.Scanner;

public class Day39Coding {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        String f1 = "Nasi Ayam";
        String f2 = "Nasi Goreng";
        String f3 = "Mie Goreng";
        String f4 = "Mie Ayam";
        String d1 = "Es Teh";
        String d2 = "Jus Jeruk";
        String d3 = "Jus Alpukat";
        String d4 = "Air Mineral";
                
        int hf1 = 15;
        int hf2 = 10;
        int hf3 = 12;
        int hf4 = 20;
        int hd1 = 5;
        int hd2 = 7;
        int hd3 = 15;
        int hd4 = 2;
        
        System.out.println("==WARUNG MAKAN PAK SLAMAT==\n");
        System.out.printf("%-15s %-15s %-15s %s", "Makanan", "Harga", "Minuman", "Harga\n");
        System.out.printf("1. %-12s Rp%d.000\t 1. %-12s Rp%d.000\n", f1, hf1, d1, hd1);
        System.out.printf("2. %-12s Rp%d.000\t 2. %-12s Rp%d.000\n", f2, hf2, d2, hd2);
        System.out.printf("3. %-12s Rp%d.000\t 3. %-12s Rp%d.000\n", f3, hf3, d3, hd3);
        System.out.printf("4. %-12s Rp%d.000\t 4. %-12s Rp%d.000\n", f4, hf4, d4, hd4);
        System.out.println("\nPilih nomor menu");
        System.out.print("Makanan: ");
        int pf = s.nextInt();
        System.out.print("Minuman: ");
        int pd = s.nextInt();
        
        int bayar = 0;
        
        if (pf == 1){
            if (pd == 1){
                bayar = hf1+hd1;
            } else if (pd == 2){
                bayar = hf1+hd2;
            } else if (pd == 3){
                bayar = hf1+hd3;
            } else if (pd == 4){
                bayar = hf1+hd4;
            } else {
                bayar = hf1;
            }
        } else if (pf == 2){
            if (pd == 1){
                bayar = hf2+hd1;
            } else if (pd == 2){
                bayar = hf2+hd2;
            } else if (pd == 3){
                bayar = hf2+hd3;
            } else if (pd == 4){
                bayar = hf2+hd4;
            } else {
                bayar = hf2;
            }
        } else if (pf == 3){
            if (pd == 1){
                bayar = hf3+hd1;
            } else if (pd == 2){
                bayar = hf3+hd2;
            } else if (pd == 3){
                bayar = hf3+hd3;
            } else if (pd == 4){
                bayar = hf3+hd4;
            } else {
                bayar = hf3;
            }
        } else if (pf == 4){
            if (pd == 1){
                bayar = hf4+hd1;
            } else if (pd == 2){
                bayar = hf4+hd2;
            } else if (pd == 3){
                bayar = hf4+hd3;
            } else if (pd == 4){
                bayar = hf4+hd4;
            } else {
                bayar = hf4;
            }
        } else {
            if (pd == 1){
                bayar = hd1;
            } else if (pd == 2){
                bayar = hd2;
            } else if (pd == 3){
                bayar = hd3;
            } else if (pd == 4){
                bayar = hd4;
            }   
        }
        
        if (bayar!=0){
            System.out.println("\nHarap menunggu pesanan di meja Anda.");
            System.out.printf("Total harga pesanan Anda Rp%d.000\n", bayar);
        } else {
            System.out.println("\nSilahkan Keluar");
        }
        
    }
    
}
