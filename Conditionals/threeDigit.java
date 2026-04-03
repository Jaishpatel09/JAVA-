package Conditionals;
import java.util.Scanner;
public class threeDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num=sc.nextInt();
        if (num>99 && num<1000) {
            System.out.println("This is a three digit Number");
        }else{
            System.out.println("This is not a three digit number");
        }
    }
    
}
