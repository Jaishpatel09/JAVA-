import java.util.ArrayList;
import java.util.Iterator;

public class hello {
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


        Iterator<Integer> it=List.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            if(it.next()==7){
                it.remove();
            }
        }
    }
}
