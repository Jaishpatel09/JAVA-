package Array;
import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(12);
        arr.add(32);
        arr.add(63);
        arr.add(100);
        arr.add(98);

        System.out.println(arr.get(2));
        System.out.println(arr);
        arr.set(2,40); // TO change element
        System.out.println(arr);

        int n=arr.size();
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}
