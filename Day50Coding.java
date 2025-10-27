package day50coding;

import java.util.Scanner;

public class Day50Coding {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int a = s.nextInt();
        String b = (a%2==0)? "GENAP" : "GANJIL";
        System.out.printf("%d adalah bilangan %s\n", a, b);
    }
    
}
