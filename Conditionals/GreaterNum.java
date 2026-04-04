package Conditionals;
import java.util.Scanner;
public class GreaterNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first Num: ");
        int a=sc.nextInt();
        System.out.print("Enter Second Num: ");
        int b=sc.nextInt();
        System.out.print("Enter third Num: ");
        int c=sc.nextInt();
        if (a>b && a>c) {
            System.out.println(a+" is Greater");      
        }else if (b>a && b>c) {
           System.out.println(b+" is Greater"); 
        }else{
            System.out.println(c+" is Greater");
        }
    }
}
