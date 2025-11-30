package evaluasi30nov;

import java.util.Scanner;

// SOAL 1
public class Soal1 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", i, a, i*a);
        }
        
    }
    
}

// SOAL 2
public class Soal2 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Iccang");
        }
        
    }
    
}

// SOAL 3
public class Soal3 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        int b = s.nextInt();
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
        
    }
    
}
