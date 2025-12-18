import java.util.ArrayList;
// import java.util.listiterator;
import java.util.ListIterator;

public class Iterator5  {
    public static void main(String[] args) {
        ArrayList<Integer> List=new ArrayList<>();
        List.add(-5);
        List.add(-6);
        List.add(7);
        List.add(-8);
        List.add(9);

        int a= List.size();
        int m=a/2;
        ListIterator<Integer> it=List.listIterator(); 
          while (it.hasNext() ) {
            Integer x= it.next();
            if (a<0){
                int volue=a*(-1);
                it.set(volue);
            }
            System.out.println(x);
//         }
//          while (it.hasPrevious() ) {
//             Integer y= it.previous();
//             System.out.println(y);
        }
         
    }
 }

