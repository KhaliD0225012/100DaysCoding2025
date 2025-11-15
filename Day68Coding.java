package day68coding;

public class Day68Coding {
    
    public static void main (String[]args){
        
        int a = 10;
        char c = 'o';
        for (int i = 0; i <= a; i++){
            for (int j = 0; j <= a*2; j++){
                if (i == 0 || i == a || j == 0 || j == a*2){
                    if (j%2==0){
                        System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print(" ");
                }
              
            }
            System.out.println("");
        }
      
    }
    
}
