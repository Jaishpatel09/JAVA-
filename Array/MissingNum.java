package Array;

public class MissingNum {
    public static int missingNum(int[] arr){
        int n=arr.length+1;
        int sum=n*(n+1)/2;
        int arraySum=0;
        for(int ele : arr){
            arraySum+=ele;
        }
        return sum-arraySum;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,7,8};
        // int a=missingNum(arr);
        System.out.println(missingNum(arr));
    }
}
