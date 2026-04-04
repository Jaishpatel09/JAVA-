package Conditionals;

import java.util.Scanner;

public class nextedifelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a num:");
        int n=sc.nextInt();
        if (n%5==0) {
            if (n%3==0) {
                System.out.println(n+" is divisible by 5 and 3 both");
                
            }else{
                System.out.println("Not divisible");
            }
            
        }else{
            System.out.println("Not Divisible");
        }
    }
}
