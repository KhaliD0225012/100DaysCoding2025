package day74coding;

import java.util.Scanner;

public class Day74Coding {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n;
        int bayar = 0;
        
        int f1 = 13;
        int f2 = 10;
        int f3 = 15;
        int d1 = 5;
        int d2 = 7;
        int d3 = 2;
        
        System.out.println("<< WARUNG MAKAN >>");
        do {
            n = 1;
            System.out.println("=== PESAN ===");
            System.out.println("1. Makanan");
            System.out.println("2. Minuman");
            if (bayar == 0) {
                System.out.println("3. Keluar");
            } else {
                System.out.println("3. Selesai Memesan");
            }
            int p1 = s.nextInt();
            if (p1 == 1) {
                do {
                    System.out.println("=== MENU MAKANAN ===");
                    System.out.println("1. Ayam Geprek");
                    System.out.println("2. Nasi Goreng");
                    System.out.println("3. Mie Goreng");
                    System.out.println("4. Kembali");
                    int p2 = s.nextInt();
                    if (p2 == 1) {
                        bayar += f1;
                    } else if (p2 == 2) {
                        bayar += f2;
                    } else if (p2 == 3) {
                        bayar += f3;
                    } else {
                        n--;
                        continue;
                    }
                    System.out.println("");
                    System.out.printf("Total harga pesanan: Rp%d.000\n", bayar);
                    System.out.println("<< INGIN MEMESAN LAGI? >>");
                } while (n == 1);
                n++;
            } else if (p1 == 2) {
                do {
                    System.out.println("=== MENU MINUMAN ===");
                    System.out.println("1. Es Teh");
                    System.out.println("2. Jus Jeruk");
                    System.out.println("3. Air Putih");
                    System.out.println("4. Kembali");
                    int p2 = s.nextInt();
                    if (p2 == 1) {
                        bayar += d1;
                    } else if (p2 == 2) {
                        bayar += d2;
                    } else if (p2 == 3) {
                        bayar += d3;
                    } else {
                        n--;
                        continue;
                    }
                    System.out.printf("Total harga pesanan: Rp%d.000\n", bayar);
                    System.out.println("<< INGIN MEMESAN LAGI? >>");
                } while (n == 1);
                n++;
            } else {
                n--;
            }

        } while (n == 1);
        if (bayar > 0) {
            System.out.printf("Total harga pesanan: Rp%d.000\n", bayar);
            System.out.println("<< SILAKAN MENUGGU DI MEJA (^_^)>>");
        } else {
            System.out.println("<< TERIMA KASIH TELAH BERKUNJUNG");
        }

    }

}
