package latihan3;

import java.util.Scanner;

public class Latihan3 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("=== ISC Cafe ===");
        System.out.println("1. Kopi");
        System.out.println("2. Jus");
        System.out.println("3. Keluar");
        
        System.out.print("Pilih kategori (1-3): ");
        int k = s.nextInt();
        
        String m1 = "Kopi Hitam";
        String m2 = "Cappucino";
        String m3 = "Latte";
        String m4 = "Jus Mangga";
        String m5 = "Jus Alpukat";
        String m6 = "Jus Jeruk";
        
        int h, p, total;
        
        if (k==1){
            System.out.println("\n=== Menu Kopi ===");
            System.out.printf("1. %-12s (Rp15.000)\n", m1);
            System.out.printf("2. %-12s (Rp20.000)\n", m2);
            System.out.printf("3. %-12s (Rp25.000)\n", m3);
            System.out.print("Pilih menu (1-3): ");
            int c = s.nextInt();
            System.out.print("\nMasukkan jumlah pesanan: ");
            p = s.nextInt();
            
            if (c==1){
                h = 15000;
                System.out.printf("\nAnda memesan %d %s\n",p, m1);
            } else if (c==2){
                h = 20000;
                System.out.printf("\nAnda memesan %d %s\n",p, m2);
            } else if (c==3){
                h = 25000;
                System.out.printf("\nAnda memesan %d %s\n",p, m3);
            } else {
                System.out.println("Pilih yang tersedia");
                return;
            }
            
        } else if (k==2){
            System.out.println("\n=== Menu Jus ===");
            System.out.printf("1. %-12s (Rp12.000)\n", m4);
            System.out.printf("2. %-12s (Rp15.000)\n", m5);
            System.out.printf("3. %-12s (Rp10.000)\n", m6);
            System.out.print("Pilih menu (1-3): ");
            int j = s.nextInt();
            System.out.print("\nMasukkan jumlah pesanan: ");
            p = s.nextInt();
            
            if (j==1){
                h = 12000;
                System.out.printf("\nAnda memesan %d %s\n",p, m4);
            } else if (j==2){
                h = 15000;
                System.out.printf("\nAnda memesan %d %s\n",p, m5);
            } else if (j==3){
                h = 10000;
                System.out.printf("\nAnda memesan %d %s\n",p, m6);
            } else {
                System.out.println("Pilih yang tersedia");
                return;
            }
            
        } else if (k==3){
            System.out.println("\n=== Terima kasih telah berkunjung ke ISC Cafe! ===");
            return;
        } else {
            System.out.println("Pilih yang tersedia");
            return;
        }
        
        total = h*p;
        System.out.println("Total bayar: Rp" + total);
        
        System.out.println("\nPilih metode pembayaran: ");
        System.out.println("1. Cash");
        System.out.println("2. QRIS");
        System.out.print("Masukkan pilihan (1-2): ");
        int b = s.nextInt();
        
        if (b==1){
            System.out.println("Pembayaran dengan CASH. Silakan bayar di kasir");
        } else if (b==2){
            System.out.println("Pembayaran dengan QRIS. Silakan scan QR ");
            System.out.println("\n== QRIS ==");
            System.out.print("Masukkan besaran pembayaran: ");
            int bp = s.nextInt();
            if (bp == total){
                System.out.println("Pembayaran berhasil");
            } else {
                System.out.println("Pembayaran tidak benar");
                return;
            }
        } else {
            System.out.println("Pilih yang tersedia");
            return;
        }
        
        System.out.println("\n=== Terima kasih telah berbelanja di ISC Cafe ===");
        
    }
    
}
