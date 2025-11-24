package day78coding;

import java.util.Scanner;

public class Day78Coding {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("<< SIGN UP AKUN EMAIL >>");
        
        // MEMINTA NAMA
        System.out.print("Nama depan\t: ");
        String depan = s.next();
        System.out.print("Nama belakang\t: ");
        String belakang = s.next();

        String nama = depan + " " + belakang;
        
        // MENENTUKAN REKOMENDASI NICK EMAIL
        String n1 = (depan.substring(0, 2) + belakang.substring(0, 2)).toLowerCase() + "";
        String n2 = (belakang.substring(0, 2) + depan.substring(0, 2)).toLowerCase() + "";
        
        // MENENTUKAN REKOMENDASI ANGKA EMAIL
        String k1 = depan.length() + "" + belakang.length();
        String k2 = belakang.length() + "" + depan.length();
        String k3 = (depan.length() * belakang.length()) + "";
        String k4 = (depan.length() + belakang.length()) + "";

        String g = "@gmail.com";
        
        // REKOMENDASI EMAIL DARI SISTEM
        System.out.println("\nRekomendasi");
        System.out.println("1. " + n1 + k1);
        System.out.println("2. " + n2 + k2);
        System.out.println("3. " + n1 + k3);
        System.out.println("4. " + n2 + k4);
        System.out.print("Pilih: ");
        int p = s.nextInt();
        
        // MEMILIH EMAIL
        String email =
                (p == 1) ? n1 + k1 + g + "":
                (p == 2) ? n2 + k2 + g + "":
                (p == 3) ? n1 + k3 + g + "":
                (p == 4) ? n2 + k4 + g + "":
                n1 + p + g + "";
        System.out.println("Email: " + email);
        System.out.println("Edit Email?: ");
        System.out.println("1. Ya");
        System.out.println("2. Tidak");
        System.out.print("Pilih: ");
        int e = s.nextInt();
        if (e == 1) {
            s.nextLine();
            System.out.print("Buat email: ");
            String edit = s.next();
            email = email.replace(email, edit.toLowerCase()+g);
            System.out.println("Email: " + email);
        }
        
        System.out.println("");
        s.nextLine();
        
        // MEMBUAT SANDI
        String sandi;
        String konfirm;
        do {
            System.out.print("Buat sandi\t\t: ");
            sandi = s.nextLine();
            if (sandi.isBlank()||sandi.isEmpty()) {
                System.out.println("<< SANDI TIDAK BOLEH KOSONG >>");
            } else if (sandi.length()<8) {
                System.out.println("<< SANDI MINIMAL 8 KARAKTER >>");
            }
        } while ((sandi.isBlank()||sandi.isEmpty()) && sandi.length()<8);
        do {
            System.out.print("Konfirmasi sandi\t: ");
            konfirm = s.nextLine();
            if (!(konfirm.equals(sandi))) {
                System.out.println("<<  SANDI SALAH >>");
            }
        } while (!(konfirm.equals(sandi)));
        System.out.println("\n<< EMAIL BERHASIL DIBUAT >>");
        
        // LOG IN
        System.out.println("\n<< LOG IN AKUN >>");
        String inEmail;
        String inNama;
        String inSandi;
        do {
            System.out.print("Email\t: ");
            inEmail = s.nextLine();
            System.out.print("Nama\t: ");
            inNama = s.nextLine();
            System.out.print("Sandi\t: ");
            inSandi = s.nextLine();
            if (!(inEmail.equals(email) && inNama.equals(nama) && inSandi.equals(sandi))) {
                System.out.println("<< EMAIL / NAMA / SANDI SALAH >>");
            }
        } while (!(inEmail.equals(email) && inNama.equals(nama) && inSandi.equals(sandi)));
        System.out.println("\n<< LOG IN BERHASIL >>");
    }

}
