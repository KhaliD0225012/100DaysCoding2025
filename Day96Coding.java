package day96coding;

import java.util.Scanner;

public class Day96Coding {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("<< KALKULATOR OPERASI 2 BILANGAN >>");
        double a = s.nextDouble();
        char o = s.next().charAt(0);;
        double b = s.nextDouble();
        if (o != '+' && o != '-' && o != '*' && o != '/') {
            System.out.println("ERROR");
        } else if (hasil(a, o, b)%1 == 0) {
            System.out.println("= "+ (int)hasil(a, o, b));
        } else {
            System.out.println("= "+ hasil(a, o, b));
        }
    }
    static double hasil(double a, char o, double b){
        double hasil =
                o == '+'? a+b:
                o == '-'? a-b:
                o == '*'? a*b:
                o == '/'? a/b:
                0;
        return hasil;
    }
    
}
