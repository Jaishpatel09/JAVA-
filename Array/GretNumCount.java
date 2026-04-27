package Array;
import java.util.Scanner;
public class GretNumCount {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int[] arr={15,24,18,7,9,26,35,41,44,22,20};
        System.out.print("Enter a num to find : ");
        int find=sc.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>find) {
                count++;
            }
        }
        System.out.println(count);
    }
}
