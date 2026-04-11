import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        int factt=1;
           
        for (int i = 1; i <=n; i++) {
            factt=factt*i;
        }
        System.out.println("Factorial of "+n+" is:"+factt);
    }
}