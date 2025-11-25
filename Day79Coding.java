package day79coding;

import java.util.Scanner;

public class Day79Coding {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("<< SIGN UP AKUN >>");

        // BUAT EMAIL
        String email;
        do {
            System.out.print("Buat email anda: ");
            email = s.nextLine();
            if (email.isBlank() || email.isEmpty()) {
                System.out.println("<< EMAIL TIDAK BOLEH KOSOSNG >>");
            } else if (!(email.contains("@gmail.com"))) {
                System.out.println("<< FORMAT SALAH >>");
            }
        } while (email.isBlank() || email.isEmpty() || !(email.contains("@gmail.com")));

        // BUAT SANDI
        String sandi;
        System.out.println("Buat sandi (minimal 8 karakter)");
        do {
            System.out.print("Buat\t: ");
            sandi = s.nextLine();
            if (sandi.isBlank() || sandi.isEmpty()) {
                System.out.println("<< SANDI TIDAK BOLEH KOSONG >>");
            } else if (sandi.length() < 8) {
                System.out.println("<< MINIMAL 8 KARAKTER >>");
            }
        } while (sandi.isBlank() || sandi.isEmpty() || sandi.length() < 8);
        System.out.println("\n<< AKUN BERHASIL DIBUAT >>");

        System.out.println("\n<< LOG IN AKUN >>");
        String inEmail;
        String inSandi;
        do {
            System.out.print("Masukkan email: ");
            inEmail = s.nextLine();
            System.out.print("Masukkan sandi: ");
            inSandi = s.nextLine();
            if (!inEmail.equals(email)) {
                System.out.println("<< EMAIL SALAH >>");
            }
            if (!inSandi.equals(sandi)) {
                System.out.println("<< SANDI SALAH >>");
            }
        } while (!inEmail.equals(email) || !inSandi.equals(sandi));
        System.out.println("\n<< LOG IN BERHASIL >>");
    }

}
