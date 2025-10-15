package day38coding;

import java.util.Scanner;

public class Day38Coding {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat: ");
        int b = s.nextInt();
        if (b<0){
            System.out.printf("%d adalah bilangan negatif.\n", b);
        } else if (b==0){
            System.out.printf("%d adalah bilangan netral (0).\n", b);
        } else {
            System.out.printf("%d adalah bilangan positif.\n", b);
        }
                
    }
    
}
