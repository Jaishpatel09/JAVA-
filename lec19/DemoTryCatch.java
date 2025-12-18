import java.util.*;

public class DemoTryCatch {
    public static void main(String[] args) {

        try {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(20);
            list.add(30);

            Iterator<Integer> itr = list.iterator();

            while (itr.hasNext()) {
                System.out.println(itr.next());
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
