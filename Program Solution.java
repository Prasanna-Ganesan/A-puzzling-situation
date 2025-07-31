 1--
   Divide two numbers---

   Problem Statement:
      Write a program to divide two integers without using the division (/) operator. You may use subtraction, loops, or bit manipulation.

   IN JAVA:
   import java.util.*;
   public class Solution{
      public static void main(String [] args){
          Scanner sc=new Scanner(System.in);
          int a,b,count=0;
          a=sc.nextInt(); //Get Input 'a'
          b=sc.nextInt(); //Get Input 'b'
          for(;a>=b;)
           {
             a=a-b;
             count++;
           }
          System.out.print(count);
          sc.close();
   }}

   2--
   Multiply two numbers---

   Problem Statement:
      Implement a function to multiply two numbers without using the multiplication (*) operator. You can use addition, loops, or recursion.

   IN JAVA:
   import java.util.*;
   public class Solution{
      public static void main(String [] args){
          Scanner sc=new Scanner(System.in);
          int a,b,i,sum=0;
          a=sc.nextInt(); //Get Input 'a'
          b=sc.nextInt(); //Get Input 'b'
          for(i=1;i<=b;i++)
             sum=sum+a;
          System.out.print(sum);
          sc.close();
   }}
   
   3--
   Toggle between 1 and 2 as input/output---

   Problem Statement:
      Write a function that takes an integer input — either 1 or 2 — and returns the other.
      For example:
          Input: 1 → Output: 2
          Input: 2 → Output: 1

   IN JAVA:
   import java.util.*;
   public class Solution{
     public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt(); //Get Input n;
       System.out.println(2/n);
       sc.close();
   }}
