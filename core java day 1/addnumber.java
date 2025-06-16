import java.util.Scanner;
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