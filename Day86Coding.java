package day86coding;

import java.util.Arrays;

public class Day86Coding {

    public static void main(String[] args) {
       
        // METODE SORT
        int a[] = {
            1, 0, 4, 34, 65, 32, 12, 8, 6
        };
        Arrays.sort(a);
        System.out.println("1. Nilai minimal: "+ a[0]);
        
        //METODE LOOP
        int b[] = {
            1, 0, 4, 34, 65, 32, 12, 8, 6
        };
        int max = 0;
        for (int i = 0; i < b.length; i++) {
            if (max < b[i]) {
                max = b[i];
            }
        }
        int min = 0;
        for (int i = 0; i < b.length; i++) {
            if (min > b[i]) {
                min = b[i];
            }
        }
        System.out.println("2. Nilai minimam: "+ min);
    }
    
}
