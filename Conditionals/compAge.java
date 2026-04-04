package Conditionals;

import java.util.Scanner;

public class compAge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     
        System.out.print("Enter age of Ram: ");
        int r=sc.nextInt();
        System.out.print("Enter age of Shyam: ");
        int s=sc.nextInt();
        System.out.print("Enter age of Ajay: ");
        int a=sc.nextInt();
        if (r<s) {
            if (r<a) {
                System.out.println("Ram is Youngest");
            }else{
                System.out.println("Ajay is Youngest");
            }
            
        }else{
            if (s<r) {
                System.out.println("Shyam is Youngest");
            }else{
                System.out.println("Ajay is Youngest");
            }
        }
    }
}
