package day53coding;

public class Day53Coding {

    public static void main(String[] args) {
        
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
            if (i%3 == 0 && i%5 == 0){
                break;
            }
        }
        
    }
    
}
