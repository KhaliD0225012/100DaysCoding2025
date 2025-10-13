package latihan;

import java.util.Scanner;

public class Latihan2 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Jumlah pelanggam hari ini: ");
        int jumlah = s.nextInt();
        for (int cus = 1; cus <= jumlah; cus++) {
            System.out.printf("Total belanja pelanggan ke-%d: ", cus);
            double bel = s.nextInt();
            double potongan = bel*10/100;
            double bayar;
            if (cus%5==0){
                bayar = bel-potongan;
                System.out.printf("Pelanggan ke-%d mendapat diskon.\n", cus);
                System.out.printf("pelanggan cukup membayar Rp%.2f\n", bayar);
            } else {
                bayar = bel;
            }
        }
        
    }
    
}
