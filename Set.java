// Dublicate element are not allowd

import java.util.HashSet;
public class Set {
    public static void main(String[] args) {
        // int arr[]={1,2,4,3,2};
        HashSet<Integer> set=new HashSet<>();
        set.add(5);
        set.add(6);
        set.add(10);
        System.out.println(set);
    }
}
