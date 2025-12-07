package finalicc;

import java.util.Scanner;

// MERATAKAN
public class Rata {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int j = s.nextInt();
        int k = 0;
        int e[] = new int[n];
        for (int i = 0; i < n; i++) {
            e[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (e[i] <= j) {
                k++;
            }
        }
        if (k == n) {
            System.out.println("RATA, WWCD");
        } else if (k != 0) {
            System.out.println(k);
        } else {
            System.out.println("NOOB!");
        }
    }
    
}

// LARI MARATON
public class Maraton {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int l = n;
        int p[] = new int[n];
        int t[] = new int[m];
        for (int i = 0; i < n; i++) {
            p[i] = s.nextInt();
        }
        for (int i = 0; i < m; i++) {
            t[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j+1 == m) {
                    break;
                }
                int x = t[j];
                int y = t[j+1];
                if (x < y) {
                    p[i] -= (y-x);
                }
                if (p[i] <= 0) {
                    l--;
                    break;
                }
            }
        }
        if (l == n) {
            System.out.println("ALL");
        } else if (l != 0) {
            System.out.println(l);
        } else {
            System.out.println(-1);
        }
        
    }
    
}

// BAGI KELOMPOK
public class Kelompok {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int k[] = new int[m];
        int x = n % m;
        for (int i = 0; i < m; i++) {
            k[i] = n / m;
            if (x != 0) {
                k[i]++;
                x--;
            }
        }
        if (n < m) {
            System.out.println(0);
        } else {
            for (int i = 0; i < m; i++) {
                System.out.print(k[i] + " ");
            }
            System.out.println("");
        }

    }

}
