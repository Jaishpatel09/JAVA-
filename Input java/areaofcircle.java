

import java.util.Scanner;
public class areaofcircle {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
    System.out.print("Enter radius:");
    int radius;
    radius=scn.nextInt();
    double pi=3.141;
    double Area=pi*radius*radius;
    System.out.println("The area of circle is:"+Area);
    
    }
}
