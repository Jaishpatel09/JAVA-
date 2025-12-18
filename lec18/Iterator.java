import java.util.ArrayList;
// import java.util.listiterator;
import java.util.ListIterator;

public class Iterator {
    public static void main(String[] args) {
        ArrayList<Integer> List=new ArrayList<>();
        List.add(5);
        List.add(6);
        List.add(7);
        List.add(8);
        List.add(9);
        List.add(10);
        List.add(11);
        List.add(12);
        List.add(13);
        List.add(14);
        List.add(15);
        ListIterator<Integer> it=List.listIterator();
         while (it.hasNext()) {
             Integer y= it.next();
            System.out.println(y);
           
        }
        while (it.hasPrevious()) {
            Integer x= it.previous(); 
             System.out.println(x);
       
        }
    }
}

