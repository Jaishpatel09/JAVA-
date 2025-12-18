// Dublicate element are not allowd

import java.util.HashSet;
public class Setarr2 {
    public static void main(String[] args) {
        int arr[]={1,2,4,3,2};
        HashSet<Integer> set=new HashSet<>();
         for(int x: arr){
            set.add(x);
         }
         if(arr.length==set.size()){
            System.out.println(true);
         }
         else{
            System.out.println(false);
         }
       // System.out.println(set);
    }
}
