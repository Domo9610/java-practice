﻿import java.util.Scanner;

class Main {  
  public static void main(String args[]) { 

    Scanner sc = new Scanner(System.in);

    String input = sc.nextLine();
    String [] arr = input.split(" ");

    int a = Integer.parseInt(arr[0]);
    int b = Integer.parseInt(arr[1]);

    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a*b);
    System.out.println(a/b);
    System.out.println(a%b);
    System.out.printf("%.2f",(float)a/(float)b);
    
  } 
}
