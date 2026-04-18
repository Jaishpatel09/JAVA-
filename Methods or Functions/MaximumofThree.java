import java.util.Scanner;

public class MaximumofThree {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        int a=sc.nextInt();
        System.out.print("Enter b: ");
        int b=sc.nextInt();
        System.out.print("Enter c: ");
        int c=sc.nextInt();

        System.out.println("Maximum is: "+Math.max(a,Math.max(b,c)));
    }
}
