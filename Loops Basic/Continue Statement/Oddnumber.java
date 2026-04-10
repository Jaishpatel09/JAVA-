import java.util.Scanner;

public class Oddnumber {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);

       System.out.print("Enter n: ");
       int n=sc.nextInt();

       for (int i = 0; i <= n; i++) {
        if (i%2==1) {
            continue;
        }
        System.out.println(i);
       }
    }
}
