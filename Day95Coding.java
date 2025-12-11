package day95coding;

import java.util.Scanner;

public class Day95Coding {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        out(a);
    }
    static void out(int a){
        System.out.println(
                a%2 == 0? "Genap":"Ganjil"
        );
    }
    
}
