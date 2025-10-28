package latihan;

import java.util.Scanner;

public class Kalender {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.printf("%-8s: ", "Tahun");
        int tahun = s.nextInt();
        if (tahun < 1){
            System.out.println("\n<< Masukkan tahun Masehi >>");
            return;
        }
        System.out.printf("%-8s: ", "Bulan");
        int bulan = s.nextInt();
        if (bulan < 1 || bulan > 12){
            System.out.println("\n<< Masukkan bulan 1 sampai 12 >>");
            return;
        }
        System.out.printf("%-8s: ", "Tanggal");
        int tanggal = s.nextInt();
        if (tanggal > 0){
            if (bulan == 2){
                if (tahun%4 == 0){
                    if (tanggal > 29){
                        System.out.println("\n<< Tanggal tidak ada >>");
                        return;
                    }
                } else {
                    if (tanggal > 28){
                        System.out.println("\n<< Tanggal tidak ada >>");
                        return;
                    }
                } 
            } else {
                if (bulan < 8){
                    if (bulan%2 == 0){
                        if (tanggal > 30){
                            System.out.println("\n<< Tanggal tidak ada >>");
                            return;
                        }
                    } else {
                        if (tanggal > 31){
                            System.out.println("\n<< Tanggal tidak ada >>");
                            return;
                        }
                    }
                } else {
                    if (bulan%2 != 0){
                        if (tanggal > 30){
                            System.out.println("\n<< Tanggal tidak ada >>");
                            return;
                        }
                    } else {
                        if (tanggal > 31){
                            System.out.println("\n<< Tanggal tidak ada >>");
                            return;
                        }
                    }
                }
            }
        }
        
        if (tahun == 1582 && bulan == 10 && tanggal >= 5 && tanggal <= 14){
            System.out.println("\n<< Tanggal tidak ada >>");
            return;
        }
        
        int hari = 1;
        int kabisat = tahun/4 - tahun/100 + tahun/400;
        
        hari += (tahun-1)*365 + kabisat;
        for (int i = 1; i <= bulan; i++) {
            int tambah;
            switch (i) {
                case 1 -> tambah = 0;
                case 2 -> tambah = 31;
                case 3 -> {
                    if (tahun%4 == 0){
                        tambah = 29;
                    } else {
                        tambah = 28;
                    }
                }
                case 4 -> tambah = 31;
                case 5 -> tambah = 30;
                case 6 -> tambah = 31;
                case 7 -> tambah = 30;
                case 8 -> tambah = 31;
                case 9 -> tambah = 31;
                case 10 -> tambah = 30;
                case 11 -> {
                    if (tahun <= 1582){
                        tambah = 21;
                    } else {
                        tambah = 31;
                    }
                }
                default -> tambah = 30;
            }
            hari += tambah;
        }
        
        hari += tanggal;
        hari %= 7;
        if (tahun <= 1582 && bulan <= 10 && tanggal <= 14){
            hari += tahun/100 - tahun/400;
            hari -= 2;
            hari %= 7;
        }       
        
        String H;
        H = switch (hari) {
            case 1, -6 -> "Ahad";
            case 2, -5 -> "Senin";
            case 3, -4 -> "Selasa";
            case 4, -3 -> "Rabu";
            case 5, -2 -> "Kamis";
            case 6, -1 -> "Jum'at";
            default -> "Sabtu";
        };
        String B;
        B = switch (bulan) {
            case 1 -> "Januari";
            case 2 -> "Februari";
            case 3 -> "Maret";
            case 4 -> "April";
            case 5 -> "Mei";
            case 6 -> "Juni";
            case 7 -> "Juli";
            case 8 -> "Agustus";
            case 9 -> "September";
            case 10 -> "Oktober";
            case 11 -> "November";
            default -> "Desember";
        };
        
        System.out.printf("\n%d %s %d Masehi adalah hari %s.\n", tanggal, B, tahun, H);
        
    }
    
}
