package day29coding;

import java.util.Scanner;

public class Day29Coding {

    public static void main(String[] args) {
       
        Scanner a = new Scanner(System.in);
        System.out.print("Masukkan bilangan\t: ");
        int b = a.nextInt();
        System.out.print("Masukkan bilangan\t: ");
        int c = a.nextInt();        
        System.out.println("Bilangan pertama lebih besar\t: " + (b>c));
        System.out.println("Bilangan kedua lebih besar\t: " + (b<c));
        
    }
    
}
