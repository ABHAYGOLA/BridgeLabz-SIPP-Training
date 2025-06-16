import java.util.Scanner;
public class PerimOfrec{ 
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
