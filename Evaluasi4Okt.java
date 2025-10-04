package evaluasi4okt;

import java.util.Scanner;

public class Evaluasi4Okt {

    public static void main(String[] args) {
        
        //SOAL 1
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int l = in.nextInt();
        
        System.out.println(p*l/4);
        
        //SOAL 2
        int a = in.nextInt();
        int b = in.nextInt();
        a+=b;
        b = a-b;
        a-=b;
        System.out.println(a);
        System.out.println(b);
        
    }
    
}
