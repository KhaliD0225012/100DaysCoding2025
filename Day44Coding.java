package day44coding;

import java.util.Scanner;

public class Day44Coding {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Nama siswa  : ");
        String nama = s.nextLine();
        System.out.print("Nilai siswa : ");
        double nilai = s.nextDouble();
        
        char predikat;
        if (nilai >= 95){
            predikat = 'A';
        } else if (nilai >= 85){
            predikat = 'B';
        } else if (nilai >= 75){
            predikat = 'C';
        } else if (nilai >= 50){
            predikat = 'D';
        } else {
            predikat = 'E';
        }
        System.out.printf("\n%s mendapat nilai %c.\n", nama, predikat);
        
    }
    
}
