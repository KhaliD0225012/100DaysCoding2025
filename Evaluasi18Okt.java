package evaluasi18okt;

import java.util.Scanner;

//Pra-Test
public class PraEvaluasi {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Nama: ");
        String n = s.nextLine();
        System.out.print("Umur: ");
        int u = s.nextInt();
        System.out.print("Tinggi: ");
        double t = s.nextDouble();
        
        System.out.printf("Nama saya %s, saya berumur %d tahun, tinggi badan saya %.2f m\n", n, u, t);
    }
    
}

//Soal 1
public class Soal1 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan nama pengguna: ");
        String n = s.nextLine();
        System.out.print("Masukkan angka dalam bentuk String: ");
        String a = s.nextLine();
        
        int b = Integer.valueOf(a);
        b++;
        b--;
        b+=3;
        System.out.println("\nNama: " + n);
        System.out.printf("Nilai akhir (Int): %d\n", b);
        a = b + "";
        System.out.println("Nilai akhir (String): " + a);
        
    }
    
}

//Soal 2
public class Soal2 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("=== Pilih Bangun Datar ===");
        
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkarang");
        
        System.out.print("Masukkan pilihan: ");
        int p = s.nextInt();
        
        double luas = 0;
        if (p==1){
            System.out.print("Masaukkan sisi: ");
            double sisi = s.nextDouble();
            luas = sisi*sisi;
        } else if (p==2){
            System.out.print("Masaukkan panjang: ");
            double panjang = s.nextDouble();
            System.out.print("Masaukkan lebar: ");
            double lebar = s.nextDouble();
            luas = panjang*lebar;
        } else if (p==3){
            double pi = 3.14;
            System.out.print("Masaukkan jari-jari: ");
            double r = s.nextDouble();
            luas = pi*r*r;
        }
        System.out.printf("Luas bangun = %.1f\n", luas);
        
    }
    
}

//Soal 3
public class Soal3 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan nama siswa: ");
        String nama = s.nextLine();
        System.out.print("Masukkan nilai siswa: ");
        int nilai = s.nextInt();
        String n;
        if (nilai >= 90){
            n = "Sangat Baik";
        } else if (nilai >= 75){
            n = "Baik";
        } else if (nilai >= 60){
            n = "Cukup";
        } else {
            n = "Tidak Lulus";
        }
        String g;
        if (nilai%2==0){
            g = "Nilai genap";
        } else {
            g = "Nilai ganjil";
        }
        System.out.printf("\nSiswa : %s %s\n", nama, n);
        System.out.println(g);
    }
    
}

//Soal 4
public class Soal4 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan nama kasir: ");
        String nama = s.nextLine();
        System.out.print("Masukkan harga barang (Rp): ");
        double harga = s.nextDouble();
        
        System.out.println("\n=== STRUK PEMBAYARAN ===");
        System.out.println("Kasir: " + nama);
        
        double diskon = 0, potongan;
        if (harga > 1000000){
            diskon = 20;
            
            
        } else if (harga >= 500000 && harga <=1000000){
            diskon = 10;
            
        } else {
            diskon = 0;
            
        }
        potongan = harga * (diskon / 100);
            double total = harga - potongan;
            System.out.printf("Harga Barang : Rp %.1f\n", harga);
            System.out.printf("Diskon (%.1f%s) : Rp%.1f\n", diskon,"%", potongan);
            System.out.printf("Total Bayar : Rp %.1f\n", total);
    
        
        }
    
}

//Soal 5
public class Soal5 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("=== Pilih operasi ===");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Modulus");
        System.out.print("Pilihan: ");
        int p = s.nextInt();
        double hasil;
        
        System.out.print("Masukkan bilangan: ");
        double a1 = s.nextDouble();
        System.out.print("Masukkan bilangan: ");
        double a2 = s.nextDouble();
        if (p==1){
            hasil = a1+a2;
        } else if (p==2){
            hasil = a1-a2;
        } else if (p==3){
            hasil = a1*a2;
        } else if (p==4){
            hasil = a1/a2;
        } else if (p==5){
            hasil = a1%a2;
        } else {
            return;
        }
        
        System.out.printf("Hasil = %.2f\n", hasil);
    }
    
}
