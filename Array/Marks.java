package Array;

public class Marks {
    public static void main(String[] args) {
        int[] marks={100,75,89,14,23,55,11,7,86,25};
        for (int i = 0; i < marks.length; i++) {
            if (marks[i]<35) {
                
                // System.out.println(marks[i]);
                System.out.println(i);
            }
        }
    }
}
