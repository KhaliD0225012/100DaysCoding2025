package day63coding;

import java.util.Scanner;

public class Day63Coding {
  
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);
    System.out.print("Perkalian 1 sampai ");
    int n = s.nextInt();
    int m = 1;
    for (int i = 2; i <= n; i++){
      m *= i;
    }
    System.out.println(m);
  }
  
}
