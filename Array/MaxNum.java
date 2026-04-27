package Array;

public class MaxNum {
    public static void main(String[] args) {
        int[] arr={15,42,82,7,9,25};
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        System.out.println("Max num of array is "+max);
    }
}
