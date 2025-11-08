package day62coding;

import java.util.Scanner;

public class Day62Coding {
  
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);
    System.out.print("Penjumlahan 1 sampai ");
    int n = s.nextInt();
    int m = 0;
    for (int i = 1; i <= n; i++){
      m += i;
    }
    System.out.println(m);
  }
  
}
