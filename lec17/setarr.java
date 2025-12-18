// Dublicate element are not allowd

import java.util.HashSet;
public class setarr {
    public static void main(String[] args) {
        int arr[]={1,2,4,3,2};
        HashSet<Integer> set=new HashSet<>();
         for(int x: arr){
            set.add(x);
         }
        System.out.println(set);
    }
}
