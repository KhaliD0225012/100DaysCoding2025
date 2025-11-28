package day83coding;

public class Day83Coding {

    public static void main(String[] args) {
        
        int a[] = {
            1, 4, 5, 6, 3, 7, 34, 7, 3
        };
        int h = 0;
        for (int i = 0; i < a.length; i++) {
            h += a[i];
        }
        System.out.println(h);
    }
    
}
