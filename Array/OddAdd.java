package Array;
public class OddAdd {
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
   public static void main(String[] args) {
    int[] arr={15,24,18,7,9,26,35,41,44,22,20};
    for (int i = 0; i < arr.length; i++) {
        if (arr[i]%2!=0) {
            arr[i]*=2;
        }else arr[i]+=10;
    }
     print(arr);
   }
}
