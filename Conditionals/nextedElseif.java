package Conditionals;

import java.util.Scanner;

public class nextedElseif {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter first num: ");
        int a=sc.nextInt();
        System.out.print("Enter second num: ");
        int b=sc.nextInt();
        System.out.print("Enter third num: ");
        int c=sc.nextInt();
        if (a>b) {
            if (a>c) {
                System.out.println(a+" is greater");
                
            }else{
                System.out.println(c+" is greater");
            }
            
        }else{
            if (b>c) {
                System.out.println(b+" is greater");
            }else{
                System.out.println(c+" is greater");
            }
        }
    }
}
