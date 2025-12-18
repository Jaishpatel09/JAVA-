import java.util.HashMap;

public class Frequency {
    public static void main(String[] args) {
        // String str = "j,s,d,f,f,g,g,h";
        HashMap<Character, Integer> map = new HashMap<>();
        String str = "j,s,d,f,f,g,g,h";
        for (char ch : str.toCharArray()) {
            if (ch != ',') { // ignore commasset.java
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        for (char ch : str.toCharArray()) {
            if (ch != ',' && map.get(ch) == 1) {
                System.out.println(ch);
                break;
            }
        }
    }
}