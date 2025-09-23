package day16coding;

import java.util.Scanner;

public class Day16Coding {
   
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan Angka yang Ingin Dioperasikan\t: ");
        double angka1 = in.nextDouble();
        System.out.print("Masukkan Operator Perkalian/Pembagian\t: ");
        char operator = in.next().charAt(0);
        System.out.print("Masukkan Angka yang Ingin Dioperasikan\t: ");
        double angka2 = in.nextDouble();
        
        double hasil;
        
        if (operator == '*'){
            hasil = angka1 * angka2;
        } else if (operator == '/'){
            if (angka2 != 0){
                hasil = angka1 / angka2;
            } else {
                System.out.println("ERROR!! Tidak dapat membagi dengan 0");
                return;
            } 
        } else {
            System.out.println("ERROR!!");
            return;
        }
        System.out.printf("Hasilnya Sama Dengan\t\t %.2f\n", hasil);
    }
    
}
