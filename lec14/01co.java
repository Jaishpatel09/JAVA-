import java.util.ArrayList;
class Main{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(1,30);
        System.out.println(list.get(1));
    }
}