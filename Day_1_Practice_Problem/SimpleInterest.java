import java.util.*;
public class Simpleinterest{ 
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
}