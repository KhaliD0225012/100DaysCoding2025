package evaluasiday100;

import java.util.Scanner;

public class MerebutKembali {

    static Scanner s = new Scanner(System.in);
    static int n = s.nextInt();
    static int X[] = new int[n];
    
    public static void main(String[] args) {
        
    int x[] = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = s.nextInt();
        }
        int p = retas(x);
        System.out.println(susunKode(p));
    }

    static int retas(int arr[]) {
        int p = 0;
        int x[] = new int[n];
        int indeks;
        for (int i = 0; i < n; i++) {
            x[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            indeks = arr[i] % n;
            do {
                if (x[indeks] == 0) {
                    x[indeks] = arr[i];
                } else {
                    indeks++;
                    if (indeks == n) {
                        indeks = 0;
                    }
                    p++;
                }
            } while (x[indeks] == 0 || x[indeks] != arr[i]);
        }
        for (int i = 0; i < n; i++) {
            X[i] = x[i];
        }
        return p;
    }

    static String susunKode(int p) {
        String kode = "";
        int length = X[p%n];
        do {
            for (int i = 0; i < n; i++) {
                kode += X[i];
                if (kode.length() >= length) {
                    break;
                }
            }
        } while (kode.length() < length);
        kode = kode.substring(0, length);
        return kode;
    }

}
