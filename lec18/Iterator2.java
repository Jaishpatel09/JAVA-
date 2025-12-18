import java.util.ArrayList;
// import java.util.listiterator;
import java.util.ListIterator;

public class Iterator2 {
    public static void main(String[] args) {
        ArrayList<Integer> List=new ArrayList<>();
        List.add(5);
        List.add(6);
        List.add(7);
        List.add(8);
        List.add(9);
        ListIterator<Integer> it=List.listIterator();
         while (it.hasNext()) {
             Integer x= it.next();
             if(x==7){
               it.add(10);
                // it.set(7);
             }
        }
        System.out.println(List);
       
    }
}

