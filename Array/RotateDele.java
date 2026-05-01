package Array;
import java.util.Scanner;
public class RotateDele {
    public static void rotatearr(int[] arr,int d){
        int n=arr.length;
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }
    public static void reverse(int[] arr,int i, int j){
        while (i<j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);    
    int[] arr={2,6,10,24,52,12,36,78,90};
    System.out.print("Enter d : ");
    int d=sc.nextInt();
    rotatearr(arr, d);
    for(int array : arr) System.out.print(array+"  ");
    }

}
