import java.util.Scanner;

public class HighestFactor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int hf=1;
        System.out.print("Enter a num:");
        int n=sc.nextInt();
        for (int i = 1; i < n; i++) {
            if (n%i==0) {
              hf=i;  
            }
        }
        System.out.println("The Highest Factor is: "+hf);
    }
}
