package day32coding;

import java.util.Scanner;

public class Day32Coding {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Kamu aktif di kelas?\t(Y/N): ");
        char a = s.next().charAt(0);
        System.out.print("Kamu menjawab quiz?\t(Y/N): ");
        char q = s.next().charAt(0);
        boolean n = (a=='Y'||q=='Y');
        System.out.println("\nNilai bertambah\t: " + n);
        
    }
    
}
