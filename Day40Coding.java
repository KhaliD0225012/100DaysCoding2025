package day40coding;

import java.util.Scanner;

public class Day40Coding {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        double a = s.nextDouble();
        System.out.print("MAsukkan operator: ");
        char o = s.next().charAt(0);
        System.out.print("Masukkan bilangan: ");
        double b = s.nextDouble();
        
        double h;
        if (o=='+'){
            h = a+b;
        } else if (o=='-'){
            h = a-b;
        } else if (o=='*'){
            h = a*b;
        } else if (o=='/'){
            if (b != 0){
                h = a/b;
            } else {
                System.out.println("Tidak dapat membagi dengan 0");
                return;
            }
        } else if (o=='%'){
            if (b != 0){
                h = a%b;
            } else {
                System.out.println("Tidak dapat mencari modulo 0");
                return;
            }
        } else {
            System.out.println("Operator tidak tersedia");
            return;
        }
        
        System.out.println("Hasil = " + h);
        
    }
    
}
