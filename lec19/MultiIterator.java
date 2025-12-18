
import java.util.ArrayList;
import java.util.Iterator;

public class MultiIterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("12");
        list.add("14");
        list.add("15");

        // 1st iterator
        Iterator<String> itr1 = list.iterator();
        System.out.println("Using Iterator 1:");
        while(itr1.hasNext()) {
            System.out.println(itr1.next());
        }

        // 2nd iterator
        Iterator<String> itr2 = list.iterator();
        System.out.println("Using Iterator 2:");
        while(itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        // 3rd iterator
        Iterator<String> itr3 = list.iterator();
        System.out.println("Using Iterator 3:");
        while(itr3.hasNext()) {
            System.out.println(itr3.next());
        }
    }
}
