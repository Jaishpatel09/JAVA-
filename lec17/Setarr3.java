// Dublicate element are not allowd

import java.util.HashSet;
public class Setarr3 {
    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        int arr1[]={1,2,5,2,6,7,8,9,3,0};
        HashSet<Integer> set=new HashSet<>();
        for(int x: arr){
            set.add(x);
        }
        System.out.println(set);
         HashSet<Integer> result=new HashSet<>();

         for(int y: arr1){
            if(set.contains(y)){
                result.add(y);
            }
         }
         System.out.println(result);
         //set.remove(1);
       
    }
}
