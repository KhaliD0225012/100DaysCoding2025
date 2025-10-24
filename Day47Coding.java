package day47coding;

import java.util.Scanner;

public class Day47Coding {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Hari ke-(1-7): ");
        int input = s.nextInt();
        String hari;
        switch (input) {
            case 1:
                hari = "Ahad";
                break;
            case 2:
                hari = "Senin";
                break;
            case 3:
                hari = "Selasa";
                break;
            case 4:
                hari = "Rabu";
                break;
            case 5:
                hari = "Kamis";
                break;
            case 6:
                hari = "Jum'at";
                break;
            case 7:
                hari = "Sabtu";
                break;
            default:
                throw new AssertionError();
        }
        System.out.println("Hari ini hari " + hari);
    }
    
}
