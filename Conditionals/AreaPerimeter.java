package Conditionals;
import java.util.Scanner;
public class AreaPerimeter {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length: ");
        double length=sc.nextDouble();
        System.out.print("Enter bredth: ");
        double bredth=sc.nextDouble();

        double area=length*bredth;
        double perimeter=2*(length+bredth);

        if (area>perimeter) {
            System.out.println("Area is Greater");
            
        }
        else if (perimeter>area) {
            System.out.println("Perimeter is Greater");
            
        }
        else if (area==perimeter) {
            System.out.println("Area and Perimeter are equal");
        }
            
        
    }
}
