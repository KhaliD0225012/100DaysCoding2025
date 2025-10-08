package day31coding;

import java.util.Scanner;

public class Day31Coding {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan bilangan positif: ");
        int a = s.nextInt();
        System.out.printf("\n%d adalah satuan\t: %b\n", a, (a>0&&a<10));
        System.out.printf("%d adalah puluhan\t: %b\n", a, (a>9&&a<100));
        System.out.printf("%d adalah belasan\t: %b\n", a, (a>10&&a<20));
        System.out.printf("%d adalah ratusan\t: %b\n", a, (a>99&&a<1000));
        
    }
    
}
