package day52coding;

public class Day52Coding {

    public static void main(String[] args) {
        
        char a = '1';
        while (a <= '9'){
            System.out.print(a);
            if ((int)a%2==0){
                System.out.println(" (GENAP)");
            } else {
                System.out.println(" (GANJIL)");
            }
            a++;
        }
        
    }
    
}
