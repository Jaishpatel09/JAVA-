import java.util.Scanner;

public class REcall {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Sides: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();


        // Odd Even
        // if (n%2==0) 
        // System.out.println("Even Number");
        // else System.out.println("Odd Number");

        // Divisible by 5 or not

        // if (n%5==0) System.out.println("Divisible by 5");
        // else System.out.println("Not Divisible");

        // Absolute value

        // if (n>=0) System.out.println("N");
        // else System.out.println("-N");

      //   if (n<0) n=-n;
      //   System.out.println(n);

   //    if (n%3==0 || n%5==0) {
   //       System.out.println("Divisible");
   //    }
   //    else System.out.println("Not Divisible");

     if (a+b>c && b+c>a && c+a>b) {
      System.out.println("This is a Triangle");
     } else System.out.println("This is not a Triangle !");
   }
}
