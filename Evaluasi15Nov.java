package evaluasi15nov;

import java.util.Scanner;

//Soal 1
public class Evaluasi15Nov {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int nilai = s.nextInt();
        String r = (nilai >= 90 && nilai <= 100)? "A":
                (nilai >= 80 && nilai <= 89)? "B":
                (nilai >= 70 && nilai <= 79)? "C":
                (nilai >= 60 && nilai <= 69)? "D":
                (nilai >= 0 && nilai <= 59)? "E": "Error";
                
        System.out.println(r);
    }
    
}

//Soal 2
public class Soal2 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int posisi = 0;
        for (;;) {
            String n = s.next();
            if (n.equals("mundur")){
                posisi--;
            } else if (n.equals("maju")){
                posisi++;
            } else if (n.equals("stop")){
                System.out.println("Berhenti jangan lanjut!!");
                return;
            }
            System.out.println(posisi);
        }
        
    }
    
}

//Soal 3
public class Soal3 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int bom = 55;
        int bawah = 0;
        int atas = 100;
        for (;;) {
            System.out.printf("Masukkan (%d - %d) : ", bawah, atas);
            int n = s.nextInt();
            if (n < bom){
                if (n > bawah){
                    bawah = n;
                }
            } else if (n > bom){
                if (n < atas){
                    atas = n;
                }
            } else {
                System.out.println("Bom");
                return;
            }
        }
        
    }
    
}

//Soal 4
public class Soal4 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int tnv = 0;
        int jnv = 0;
        int jnt = 0;
        int nvk = 100;
        int nvb = 0;
        double rnv;
        
        for (int i = 0; i < 10; i++) {
            int n = s.nextInt();
            if (n >= 0 && n <= 100){
                jnv++;
                tnv += n;
                if (n > nvb){
                    nvb = n;
                }
                if (n < nvk){
                    nvk = n;
                }
            } else {
                jnt++;
            }
        }
        rnv = (double) tnv/ (double)jnv;
        
        System.out.println("Total nilai valid: " + tnv);
        System.out.println("Jumlah nilai valid: " + jnv);
        System.out.println("Total nilai tidak valid: " + jnt);
        System.out.println("Nilai valid terkecil: " + nvk);
        System.out.println("Nilai valid terbesar: " + nvb);
        System.out.println("Rata-rata nilai valid: " + rnv);
        
    }
    
}

//Soal 5
public class Soal5 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        char o = s.next().charAt(0);
        int b = s.nextInt();
        int h;
        System.out.println("=== Kalkulator Sederhana ===");
        switch (o) {
            case '+':
                h = a+b;
                System.out.printf("Hasil dari %d %c %d adalah %d", a, o, b, h);
                break;
            case '-':
                h = a-b;
                System.out.printf("Hasil dari %d %c %d adalah %d", a, o, b, h);
                break;
            case '*':
                o = 'x';
                h = a*b;
                System.out.printf("Hasil dari %d %c %d adalah %d", a, o, b, h);
                break;
            case '/':
                double i;
                i = (double)a/(double)b;
                System.out.printf("Hasil dari %d %c %d adalah %d", a, o, b, 1);
                break;
            case '%':
                h = a%b;
                System.out.printf("Hasil dari %d %c %d adalah %d", a, o, b, h);
                break;
            default:
                throw new AssertionError();
        }
        
    }
    
}
