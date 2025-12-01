package day85coding;

public class Day85Coding {

    public static void main(String[] args) {
        
        int a[] = {
            1, 0, 4, 34, 65, 32, 12, 8, 6
        };
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Nilai Maximal: "+ max);
        
    }
    
}
