package dayy76coding;

import java.util.Scanner;

public class Dayy76Coding {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String pw = "Informatics25";
        System.out.print("Masukkan password: ");
        String in = s.nextLine();
        
        String f1 = (in.equals(pw))? "Unlocked":"Locked";
        String f2 = (in.equalsIgnoreCase(pw))? "Unlocked":"Locked";
        String f3 = (in.contains("25"))? "Unlokced":"Locked";
        String f4 = !(in.isEmpty())? "Unlokced":"Locked";
        
        System.out.println("File 1: "+ f1);
        System.out.println("File 2: "+ f2);
        System.out.println("File 3: "+ f3);
        System.out.println("File 4: "+ f4);
        
    }
    
}
