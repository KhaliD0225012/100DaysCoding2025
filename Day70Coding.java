package day70coding;

import java.util.Scanner;

public class Day70Coding {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Panjang\t: ");
        int p = s.nextInt();
        System.out.print("Lebar\t: ");
        int l = s.nextInt();
        char c = '*';
        for (int i = 0; i <= p; i++) {
            for (int j = 0; j <= l; j++) {
                if (i == 0 || i == p || j == 0 || j == l){
                    System.out.print(c);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
    }
    
}
