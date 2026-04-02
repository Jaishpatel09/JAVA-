package Conditionals;
import java.util.Scanner;
public class divisible5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a num:");
        int n=sc.nextInt();
        if (n%5==0) {
            System.out.println("Divisible By 5");
        }else{
            System.out.println("Not Divisible By 5");
        }

    }
}
