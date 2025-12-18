public class Exception {
    public static void main(String[] args) {
        try {
            voteAge(15);

        } 
        catch (Exception e) {
            // System.out.println(int age);{
        }
    }

    static void voteAge(int age) {
        System.out.println("Check for vote");
        if (age < 18) {
            throw new IllegalArgumentException("aap vote nahi dal sakte");

        }

    }
}
