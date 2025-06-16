import java.util.Scanner;
class AreaOfcircle{ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius");
        int a = sc.nextInt();
        System.out.println("area of circle is :" + (2*3.14*a));
    }
}