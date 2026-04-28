package Array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static int[] twosum(int[] arr,int target){
        int n=arr.length;
        int[] num=new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i]+arr[j]==target) {
                    num[0]=i; 
                    num[1]=j;
                    break;
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={4,6,36,25,84,64,56,40};
        
        System.out.print("Enter target : ");
        int target= sc.nextInt();
    
        int[] result = twosum(arr, target);  
        System.out.println(Arrays.toString(result));
    }
}