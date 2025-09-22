package day15coding;

import java.util.Scanner;

public class Day15Coding {
   
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan Angka yang Ingin Dioperasikan\t\t: ");
        double angka1 = in.nextDouble();
        System.out.print("Masukkan Operator Penjumlahan/Pengurangan\t: ");
        char operator = in.next().charAt(0);
        System.out.print("Masukkan Angka yang Ingin Dioperasikan\t\t: ");
        double angka2 = in.nextDouble();
        
        double hasil;
        
        if (operator == '+'){
            hasil = angka1 + angka2;
        } else if (operator == '-'){
            hasil = angka1 - angka2;
        } else {
            System.out.println("ERROR!!");
            in.close();
            return;
        }
        System.out.printf("Hasilnya Sama Dengan\t\t %.2f\n", hasil);
    }
    
}
