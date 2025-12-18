import java.util.HashMap;

public class HashMap {
    public static void main(String[] args) {
        Hashmap<Integer,Integer> map=new HashMap();
        int arr[]={1,2,4,2,1,5,2,5,1};
        for (int x : arr){
            map.put(x,map.getOrDefault(x,0)+1);

        }
        System.out.println(map);
    }
}
