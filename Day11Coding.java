package day11coding;

import java.util.Scanner;

public class Day11Coding {

   public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Kalkulator Sederhana");
        
        System.out.print("Masukkan Angka\t: ");
        double angka1 = input.nextDouble();
        
        System.out.print("Pilih Opersi\t: ");
        char operasi = input.next().charAt(0);
        
        System.out.print("Masukkan Angka\t: ");
        double angka2 = input.nextDouble();
        
        double hasil;
        
        if (operasi == '+'){
            hasil = angka1 + angka2;
        } else if (operasi == '-'){
            hasil = angka1 - angka2;
        } else if (operasi == '*'){
            hasil = angka1 * angka2;
        } else if (operasi == '/'){
            if (operasi != 0){
            hasil = angka1 / angka2;
            } else {
                System.out.println("Tidak dapat membagi dengan 0");
                input.close();
                return;
            }
        } else if (operasi == '%'){
            hasil = angka1 % angka2;
        } else {
            System.out.println("Operasi tidak dikenal");
            input.close();
            return;
        }
        
        System.out.println("Hasil\t\t: " + hasil);
        input.close();
        return;
        
    }
    
}
