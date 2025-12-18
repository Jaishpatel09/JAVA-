import java.util.HashMap;
public class Target {
   public static void main(String[] args) {
    HashMap<Integer,Integer> map=new HashMap();
    int arr[]={1,2,2,7,5,2,}
    int Target=9;
    for(int i=0;i<arr.length;i++){
        int diff=Target-arr[i];
        if (map.containsKey(diff)){
            System.out.println(map.get(diff)+""+i);
            break;
        }
        map.put(arr[i],i);
    }
  }
}