import java.util.Scanner;

public class EvennNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        while (i<=n) {
            if (i%2==0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
