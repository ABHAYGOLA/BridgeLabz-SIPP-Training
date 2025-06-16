Online Java Compiler
Use this editor to write, compile and run your Java code online
import java.util.*;
class addnumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number :");
        int a = sc.nextInt();
        System.out.println("enter second number :");
        int b = sc.nextInt();
        System.out.println("the sum is " + (a+b));
    }
}

import java.util.*;
class addnumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius");
        int a = sc.nextInt();
        System.out.println("area of circle is :" + (2*3.14*a));
    }
}

import java.util.*;
class tempreture{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the tempreture in ferhenite value ");
        int f = sc.nextInt();
        int c = (f - 32) * 5/9 ;
        System.out.println("the tempreture is : " + c);
    }
}



Simple Interest = (Principal * Rate * Time) / 100

import java.util.*;
public class simpleinterest{
    public static void main (String[] arg){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the principal amount :");
        int p = sc.nextInt();
        System.out.println("enter the rate of interest :");
        int r = sc.nextInt();
        System.out.println("enter the time :");
        int t = sc.nextInt();
        int st = (p*r*t)/100;
        System.out.println("the simple interest is :" + st);
    }
// 

import java.util.*;
public class simpleinterest{
    public static void main (String[] arg){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the  length :");
        int l = sc.nextInt();
        System.out.println("enter the width");
        int b = sc.nextInt();
        int p = 2*(l+b);
        System.out.println("the perimeter of rectangle is :" + p);
    }
}

import java.util.*;
public class simpleinterest{
    public static void main (String[] arg){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the base ");
        double b = sc.nextInt();
        System.out.print("enter the exponent");
        double e = sc.nextInt();
        double p = Math.pow(b,e);
        System.out.println("the result is :" + p);
    }
}

import java.util.*;
public class simpleinterest{
    public static void main (String[] arg){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
        System.out.println("enter the third number");
        int c=sc.nextInt();
        System.out.println("the average of three number is :" + (a+b+c)/3);
    }
}

import java.util.*;
public class simpleinterest{
    public static void main (String[] arg){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the kilometers :");
        double k = sc.nextInt();
        double m = k*0.621371;
        System.out.println("the result in miles is :" + m);
        
    }
}