package latihan;

import java.util.Scanner;

public class DariMarsya {
    
    public static void main(String[] args) {
        
        int bom = 56;
        int awal = 0, akhir = 100;
        Scanner s = new Scanner(System.in);
        
        for (;;){
            System.out.printf("Masukkan angka dari %d sampai %d: ", awal, akhir);
            int a = s.nextInt();
            
            if ((bom-a<=5&&bom-a>0) || (a-bom<=5&&a-bom>0)){
                awal = awal;
                akhir = akhir;
            } else if (a>akhir){
                akhir = akhir;
            } else if (awal>a){
                awal = awal;
            } else if (a-awal > akhir-a){
                akhir = a;
            } else if (a-awal < akhir-a){
                awal = a;
            }
            if (a == bom){
                System.out.println("MENANG");
                break;
            }
        }
    }
    
}
