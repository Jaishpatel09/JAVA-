package Conditionals;
import java.util.Scanner;
public class Divisible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num=sc.nextInt();
        if (num%5==0 || num%3!=0) {
            System.out.println("The number is divisible by 5 or divisible by 3");
        }else{
            System.out.println("The number is not divisible by 5 or 3");
        }

    }
}
