package Array;

public class MinElement {
    public static void main(String[] args) {
        int[] arr={15,42,82,7,9,25};
        int min=arr[0];
        for (int i = 0; i<arr.length; i++) {
            if (min>arr[i]) {
                min=arr[i];
            
        }
    }
    System.out.println("Min num of array is "+min);
  }
}