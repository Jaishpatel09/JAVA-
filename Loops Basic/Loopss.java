import java.util.Scanner;

public class Loopss {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // for (int i = 0; i < 10; i++) {
        //     System.out.println("Jaish Patel");
        // }

        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(i);
        // }
        // for (int i = 1; i <= 100; i++) {
        //     if (i%3==0) {
        //         System.out.print(i+" ");
        //     }
        // }

        int n=sc.nextInt();
        for (int i = n; i >=1; i--) {
            System.out.println(i+" ");
        }
    }
}
