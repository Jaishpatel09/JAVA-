public class Scope {
    static int i;//Global Varible
    public static void main(String[] args) {
        i=15;
        System.out.println(i);
        int i=23;//Local Variable
        System.out.println(i);
    }
}
