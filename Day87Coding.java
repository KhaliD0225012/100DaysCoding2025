package day87coding;

import java.util.Scanner;

public class Day87Coding {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String nama[] = {
            "Marsya", "Abrar", "Khalid", "Iqra", "Alim"
        };
        String in = s.nextLine();
        String out = "Nama " + in +" tidak terdaftar";
        for (int i = 0; i < nama.length; i++) {
            if (in.equalsIgnoreCase(nama[i])) {
                out = "Nama "+ nama[i] +" ada di indeks "+ i;
            }
        }
        System.out.println(out);
        
    }
    
}
