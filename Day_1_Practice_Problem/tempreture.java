import java.util.Scanner;
class tempreture{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the tempreture in ferhenite value ");
        int f = sc.nextInt();
        int c = (f - 32) * 5/9 ;
        System.out.println("the tempreture is : " + c);
    }
}