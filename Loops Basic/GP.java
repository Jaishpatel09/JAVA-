import java.util.Scanner;

public class GP {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Nth term:");
    int n=sc.nextInt();
    System.out.print("Enter First Term:");
    int a=sc.nextInt();
    System.out.print("Enter Ratio:");
    int r=sc.nextInt();

    for (int i = 1; i < n; i++) {
        System.out.print(a+" ");
        a*=r; //a=a*r;
        
    }
   } 
}


