package day72coding;

public class Day72Coding {

    public static void main(String[] args) {
        
        int p = 10;
        for (int i = 1; i <= p; i++) {
            for (int j = p; j >= i; j--) {
                System.out.print("o ");
            }
            System.out.println("");
        }
        System.out.println("======= DAN =======");
        for (int i = 1; i <= p; i++) {
            for (int j = p-1; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("o ");
            }
            System.out.println("");
        }
        
    }
    
}
