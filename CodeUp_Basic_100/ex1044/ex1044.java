﻿import java.util.Scanner;

class Main {  
  public static void main(String args[]) { 

    Scanner sc = new Scanner(System.in);

    int input = sc.nextInt();

    long result = (long)input;

    System.out.printf("%d",(++result));
    
  } 
}
