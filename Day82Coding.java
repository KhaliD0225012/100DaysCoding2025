package day82coding;

import java.util.Scanner;

public class Day82Coding {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Input: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Output: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        
    }
    
}
