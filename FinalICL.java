package finalicl;

import java.util.Arrays;
import java.util.Scanner;

// KISAH KATAK DALAM SUMUR
public class Katak {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int h = s.nextInt();
        int total = 0;
        int jump[] = new int[n];
        for (int i = 0; i < n; i++) {
            jump[i] = s.nextInt();
        }
        Arrays.sort(jump);
        h -= jump[n - 1];
        total += jump[n - 1];
        for (int i = 0; i < n; i++) {
            if (jump[i] >= h) {
                h -= jump[i];
                total += jump[i];
                break;
            }
        }
        System.out.println(total);

    }

}


// PERJUANGAN SUBMIT
public class Submit {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int S = s.nextInt();
        int point[] = new int[n];
        for (int i = 0; i < n; i++) {
            point[i] = s.nextInt();
        }
        int a = 0;
        String h = "GAGAL";
        do {
            if (a == 5) {
                h = "BERHASIL";
                break;
            }
            int x = point[a];
            int y = point[a + 1];
            if (y > x) {
                S -= (y - x);
            }
            a++;
        } while (S > 0);
        System.out.println(h);
    }

}

// TEMPAT DUDUK INTROVERT
public class Introvert {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k[] = new int[n];
        for (int i = 0; i < n; i++) {
            k[i] = s.nextInt();
        }
        boolean duduk = false;
        int kursi = 0;
        int r = 0;
        int l = 0;
        if (k[0] == 0) {
            for (int i = 0; i < n-1; i++) {
                if (k[i] == 1) {
                    break;
                }
                r++;
            }
        }
        if (k[n - 1] == 0) {
            for (int i = n - 1; i > 0; i--) {
                if (k[i] == 1) {
                    break;
                }
                l++;
            }
        }
        if (r != 0 || l != 0) {
            duduk = true;
            if (r > l) {
                kursi = 1;
            } else {
                kursi = n;
            }
        }
        if (duduk == false) {
            for (int i = n-2; i > 0; i--) {
                if (k[i]==0 && k[i-1]==0 && k[i+1]==0) {
                    duduk = true;
                    kursi = i+1;
                    break;
                }
            }
        }
        if (duduk == false) {
            kursi = -1;
        }
        System.out.println(kursi);
    }
    
}

// STRING CANTIK
public class Cantik {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String A = s.nextLine();
        String a = A.toUpperCase();
        String b = "TIDAK CANTIK";
        if (a.contains("I") && a.contains("S") && a.contains("C")) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == 'I') {
                    for (int j = i; j < a.length(); j++) {
                        if (a.charAt(j) == 'S') {
                            for (int k = j; k < a.length(); k++) {
                                if (a.charAt(k) == 'C') {
                                    b = "CANTIK";
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(b);
    }

}
