import java.util.Scanner;

public class ProductofNonZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter n: ");
        int n=sc.nextInt();
        int product=1;
        while (n!=0) {
           
            int digit=n%10;
            if (digit!=0) {
                
                product=product*digit;
            }
            n=n/10;
        }
         System.out.println("Product of Digits is: "+product);
    }
}
