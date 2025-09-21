// Soal 1
package evaluasi1;

public class Evaluasi1 {

   public static void main(String[] args) {
        
        String nama = "Budi";
        double tinggi = 170.5;
        double berat = 65.4;
        int nomor = 12;
        int sks = 144;
        String nim = "D0223033";
        char gender = 'L';
        boolean kuliah = true;
        
        System.out.print("====PRINT====");
        System.out.print("\nNama\t\t: " + nama);
        System.out.print("\nTinggi Badan\t; " + tinggi);
        System.out.print("\nBerat Badan\t: " + berat);
        System.out.print("\nNomor Absen\t: " + nomor);
        System.out.print("\nSKS\t\t: " + sks);
        System.out.print("\nNIM\t\t: " + nim);
        System.out.print("\nJenis Kelamin\t: " + gender);
        System.out.print("\nStatus Kuliah\t: " + kuliah);
        
        System.out.println("\n====PRINTLN====");
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Tinggi Badan\t; " + tinggi);
        System.out.println("Berat Badan\t: " + berat);
        System.out.println("Nomor Absen\t: " + nomor);
        System.out.println("SKS\t\t: " + sks);
        System.out.println("NIM\t\t: " + nim);
        System.out.println("Jenis Kelamin\t: " + gender);
        System.out.println("Status Kuliah\t: " + kuliah);
        
        System.out.printf("\n====PRINTF====\n");
        System.out.printf("Nama\t\t: %s\n", nama);
        System.out.printf("Tinggi Badan\t; %.2f\n", tinggi);
        System.out.printf("Berat Badan\t: %.2f\n", berat);
        System.out.printf("Nomor Absen\t: %d\n", nomor);
        System.out.printf("SKS\t\t: %d\n", sks);
        System.out.printf("NIM\t\t: %s\n", nim);
        System.out.printf("Jenis Kelamin\t: %c\n", gender);
        System.out.printf("Status Kuliah\t: %b\n", kuliah);
        
        
    }
    
}

// Soal 2
package evaluasi2;

public class Evaluasi2 {
    
    public static void main(String[] args) {
        
        String nama;
        double tinggi;
        double berat;
        int nomor;
        int sks;
        String nim;
        char gender;
        boolean kuliah;
        
        nama = "Budi";
        tinggi = 170.5;
        berat = 65.4;
        nomor = 12;
        sks = 144;
        nim = "D0223033";
        gender = 'L';
        kuliah = true;
        
        nama = "Khalid";
        tinggi = 168.5;
        berat = 55.6;
        nomor = 3;
        sks = 20;
        nim = "D0225012";
        
                
        System.out.println("\n====PRINTLN====");
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Tinggi Badan\t: " + tinggi);
        System.out.println("Berat Badan\t: " + berat);
        System.out.println("Nomor Absen\t: " + nomor);
        System.out.println("SKS\t\t: " + sks);
        System.out.println("NIM\t\t: " + nim);
        System.out.println("Jenis Kelamin\t: " + gender);
        System.out.println("Status Kuliah\t: " + kuliah);
        
    }
    
}

// Soal 3
package evaluasi3;

import java.util.Scanner;

public class Evaluasi3 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Jenis Kelamin: ");
        char gender = input.next().charAt(0);
        System.out.print("Masukkan Nomor Absen: ");
        int absen = input.nextInt();
        System.out.print("Tinggi Badan: ");
        double tinggi = input.nextDouble();
        
        System.out.println("\n====OUTPUT====");
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Jenis Kelamin\t: " + gender);
        System.out.println("Nomor Absen\t: " + absen);
        System.out.printf("Tinggi Badan\t: %.2fcm\n", tinggi);
        
        
    }
    
}

// Soal Terakhir
package lastev;

import java.util.Scanner;

public class LastEv {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama: ");
        final String nama = input.nextLine();
        System.out.print("Masukkan Jenis Kelamin: ");
        final char gender = input.next().charAt(0);
        System.out.print("Masukkan Nomor Absen: ");
        final int absen = input.nextInt();
        System.out.print("Tinggi Badan: ");
        final double tinggi = input.nextDouble();
        
        System.out.println("\n====OUTPUT====");
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Jenis Kelamin\t: " + gender);
        System.out.println("Nomor Absen\t: " + absen);
        System.out.printf("Tinggi Badan\t: %.2fcm\n", tinggi);
        
        
        
    }
    
}
