package day92coding;

public class Day92Coding {

    public static void main(String[] args) {
        
        int n = 10;
        a(n);
        System.out.println("\n"+ b(n));
        
    }
    static void a(int a){
        for (int i = 1; i < a; i++) {
            if (i == 7) {
                return;
            }
            System.out.println(i*a);
        }
    }
    static int b(int a){
        return a*a;
    }
    
}
