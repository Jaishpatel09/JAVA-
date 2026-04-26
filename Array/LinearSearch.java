package Array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={15,42,82,7,9,25};
        int x=5;
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x) {
               flag=true;
            }
        }
        if (flag==true) {
            System.out.println("Found");
        }else System.out.println("Not Found");
    }
}
