

import java.util.Scanner;
public class PowCalcu{ 
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