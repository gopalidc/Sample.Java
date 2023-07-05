package com.mycompany;

import java.util.Scanner;

public class Main01 {
   public static void main(String[] args) {
      System.out.println("Enter a, b ,c");
      Scanner sc = new Scanner(System.in);
      char var = sc.next().charAt(0);   
      switch (var) {
         case 'a':
            System.out.println("A for Apple");
            break;
         case 'b':
            System.out.println("B for ball");
            break;
         case 'c':
            System.out.println("C for cat");
            break;
         default:
            System.out.println("Wrong entry");
      }

   }
}