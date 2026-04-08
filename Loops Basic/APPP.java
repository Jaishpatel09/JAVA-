// WAP to make AP by user input
import java.util.Scanner;

public class APPP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Nth Term: ");
        int n=sc.nextInt();
        System.out.print("Enter First Num of AP: ");
        int a=sc.nextInt();
        System.out.print("Enter Common Difference:");
        int d=sc.nextInt();

        int an=a+(n-1)*d;
        System.out.println("The AP is: ");
        for(int i=a;i<=an;i+=d){
            System.out.println(i+" ");
        }
    }
}
