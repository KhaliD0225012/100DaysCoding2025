package day35coding;

import java.util.Scanner;

public class Day35Coding {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Nama\t: ");
        String na = s.nextLine();
        System.out.print("Nilai\t: ");
        double ni = s.nextDouble();
        
        char gr;
        String st;
        
        if (ni <= 0){
            gr = 'F';
        } else if (ni < 25){
            gr = 'E';
        } else if (ni < 50){
            gr = 'D';
        } else if (ni < 75){
            gr = 'C';
        } else if (ni < 90){
            gr = 'B';
        } else if (ni < 100){
            gr = 'A';
        } else {
            gr = 'S';
        }
        
        if (ni > 50){
            st = "LULUS";
        } else {
            st = "GAGAL";
        }
        
        System.out.printf("%s mendapat nilai %c dan dinyatakan %s\n", na, gr, st);
        
    }
  
}
