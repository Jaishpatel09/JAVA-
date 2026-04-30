package Array;

import java.util.Scanner;

public class ReverseKNums {
     public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={2,6,10,24,52,12,36,78,90};
        print(arr);
        int n=arr.length;
        int i=0; int j=n-1;
        while (i<j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        print(arr);
         

    }
}