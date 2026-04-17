import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Column: ");
        int n=sc.nextInt();
        System.out.print("Enter Row: ");
        int m=sc.nextInt();
        for (int i = 1; i <=m; i++) {
            for (int j = 1; j <=n; j++) {
                if (i==1 || i==m || j==1 || j==n) {
                    
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
