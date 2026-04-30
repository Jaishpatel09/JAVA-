package Array;

public class SecondMaximum {
    public static void main(String[] args) {
    int[] arr={15,24,18,7,9,26,35,41,44,22,20};
    int max=Integer.MIN_VALUE;
    int smax=Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i]>max) {
            max=arr[i];
        }
    }
    for (int i = 0; i < arr.length; i++) {
        if (arr[i]>smax && arr[i]!=max ) {
            smax=arr[i];
        }
    }
    System.out.println("Second Maximum Element is : "+smax);

    }
}
