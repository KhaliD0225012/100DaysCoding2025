package day12coding;

import java.util.Scanner;

public class Day12Coding {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.println("Biodata");
        
        System.out.print("Nama Lengkap\t: ");
        String nama = input.nextLine();
        
        System.out.print("Jenis Kelamin\t: ");
        String gender = input.nextLine();
        
        System.out.print("Tempat Lahir\t: ");
        String tempat = input.nextLine();
        
        System.out.print("Tanggal Lahir\t: ");
        String tanggal = input.nextLine();
       
        System.out.print("Agama\t\t: ");
        String agama = input.nextLine();
        
        System.out.print("Alamat\t\t: ");
        String alamat = input.nextLine();
        
        System.out.print("Golongan Darah\t: ");
        String darah = input.nextLine();
        
        System.out.print("Status Hubungan\t: ");
        String status = input.nextLine();
        
        System.out.print("Pekerjaan\t: ");
        String kerja = input.nextLine();

        System.out.println("Nama\t\t: " + nama);
        System.out.println("Jenis Kelamin\t: " + gender );
        System.out.printf("Tempat/Tanggal Lahir\t: %s, %s\n", tempat, tanggal);
        System.out.println("Agama\t\t: " + agama);
        System.out.println("Alamat\t\t: " + alamat);
        System.out.println("Golongan Darah\t: " + darah);
        System.out.println("Status\t\t: " + status);
        System.out.println("Pekerjaan\t:" + kerja);
        
    }
    
}
