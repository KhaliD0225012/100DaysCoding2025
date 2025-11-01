package evaluasi1nov;

import java.util.Scanner;

//Soal 1
public class Soal1 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Batas Bawah : ");
        int b = s.nextInt();
        System.out.print("Batas Atas : ");
        int a = s.nextInt();
        System.out.print("Angka : ");
        int c = s.nextInt();
        String d = (c<=a && c>=b)? "YAYAYAYA":"NONNONO";
        System.out.println(d);
        
    }
    
}

//Soal 2
public class Soal2 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Batas Bawah : ");
        int a = s.nextInt();
        String b = (a>70)? "Ujian Kroco Ji Pale":"Sa Jappo’ka Aih";
        System.out.println(b);
        
    }
    
}

//Soal 3
public class Soal3 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Batas Bawah : ");
        int a = s.nextInt();
        String b = (a%2 == 0)? "Iyaji":"Tidakji";
        System.out.println(b);
        
    }
    
}
