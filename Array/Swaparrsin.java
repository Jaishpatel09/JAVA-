package Array;

public class Swaparrsin {
    public static void main(String[] args) {
    int[] arr={2,6,10,24,52,12,36,78,90};
    int n=arr.length;
    for(int i=0;i<n/2;i++){
        int temp=arr[i];
        arr[i]=arr[n-1-i];
        arr[n-1-i]=temp;
    }
    for(int array : arr) System.out.print(array+" ");
    }
}
