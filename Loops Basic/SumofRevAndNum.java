import java.util.Scanner;

public class SumofRevAndNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");    
        int n=sc.nextInt();
        int a=n;
        int rev=0;
        while (n!=0) {
            int digit =n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        System.out.println(rev+a);
    }
}
