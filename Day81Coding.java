package day81coding;

import java.util.Scanner;

public class Day81Coding {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String nama[] = {
            "Khalid", "Galang", "Gilang", "Farham", "Adit"
        };
        
        System.out.println("Array 5 Elemen");
        System.out.print("Cetak indeks ke-");
        int p = s.nextInt();
        System.out.println(nama[p]);
        
    }
    
}
