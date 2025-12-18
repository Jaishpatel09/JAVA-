import java.util.*;
class Main{
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,11);
        map.put(2,22);
        System.out.println(map.get(3));
        System.out.println(map.getOrDefault(3,0));
        System.out.println(map.containsKey(3));
        for(int x:map.keySet()){
            System.out.println(map.get(x));
        }
    }
}