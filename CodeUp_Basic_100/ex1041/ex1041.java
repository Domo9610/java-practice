﻿import java.util.Scanner;

class Main {  
  public static void main(String args[]) { 

    Scanner sc = new Scanner(System.in);

    char input = sc.nextLine().charAt(0);

    int change = input + 1;
    
    System.out.println((char)change);
    
  } 
}
