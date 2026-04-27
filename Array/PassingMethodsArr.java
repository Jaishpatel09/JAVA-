package Array;

public class PassingMethodsArr {
    static void change(int[] arr){
        arr[3]=50;
    }
    public static void main(String[] args) {
       int[] arr={15,24,18,7,9,26,35,41,44,22,20};
       System.out.println(arr[3]);
       change(arr);
       System.out.println(arr[3]);

    }
}
