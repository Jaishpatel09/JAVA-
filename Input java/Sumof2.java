import java.util.Scanner;
public class Sumof2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;
        int sum;
        System.out.print("Enter First num:");
        a=sc.nextInt();
        System.out.print("Enter Second num:");
        b=sc.nextInt();
        
        sum=a+b;
        System.out.println("The sum of two num is:"+sum);
    }
}
