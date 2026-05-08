package Array;

public class segregate {
    static void segregatearr(int[] arr){
        int numofzero=0;
        int numofone=0;
        for(int array:arr)
            if (array==0) {
                numofzero++;
            }else numofone++;

        for(int i = 0; i < numofzero; i++){
            arr[i] = 0;
        }
        for (int i = numofzero; i < arr.length; i++) {
            arr[i]=1;
        }

        for(int array:arr){
            System.out.print(array+" ");
        }

    }
    public static void main(String[] args) {
        int[]  arr={0,0,1,0,1,1,0,1,1,0,0};
        segregatearr(arr);
    }
}
