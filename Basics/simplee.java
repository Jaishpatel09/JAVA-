import java.util.Scanner;

public class simplee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius:");
        int radius = sc.nextInt();

        double pi = 3.141;
        double Area = pi * radius * radius;

        System.out.println("The area of circle is: " + Area);
    }
}