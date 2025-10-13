package day36coding;

import java.util.Scanner;

public class Day36Coding {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int j = 270;
        for (int l = 1; l <= j; l++) {
            System.out.printf("Langkah ke-%d\n", l);
            if (l==8){
                System.out.println("Sandal putus! ");
                
            } else if (l==17){
                System.out.print("Sampai di rumah Budi. Singgah? (Y/T): ");
                char ans = s.next().charAt(0);
                if (ans == 'Y'||ans == 'y'){
                    System.out.println("Masuk dan minum kopi.");
                    break;
                } 
            } else if (l==28){
                System.out.print("Sampai di rumah Mail. Singgah? (Y/T): ");
                char ans = s.next().charAt(0);
                if (ans == 'Y'||ans == 'y'){
                    System.out.println("Masuk dan main PS.");
                    break;
                } 
            } else if (l==47){
                System.out.print("Sampai di toko. Beli sandal baru\n");  
                
            } else if (l==123){
                System.out.print("Sampai di lapangan bola. Singgah? (Y/T): ");
                char ans = s.next().charAt(0);
                if (ans == 'Y'||ans == 'y'){
                    System.out.println("Ikut bermain bola.");
                    break;
                } 
            } else if (l==270){
                System.out.println("Sampai di sekolah.");
            }
        }
        
    }
    
}
