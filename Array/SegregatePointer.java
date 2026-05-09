package Array;

public class SegregatePointer {
    static void segregate0and1(int[] arr){
        int n=arr.length;
        int i=0,j=n-1;
        while (i<j) {
            if (arr[i]==0) i++;
            if (arr[j]==1) j--;

            if (i>j) {
                break;
            }
            if (arr[i]==1 && arr[j]==0) {
                arr[i]=0; 
                arr[j]=1;
                i++;
                j--; 
            }
        }
         for(int array:arr){
            System.out.print(array+" ");
        }
    }
    public static void main(String[] args) {
        int[]  arr={0,0,1,0,1,1,0,1,1,0,0};
        segregate0and1(arr);
    }
}
