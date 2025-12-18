import java.util.HashMap;

public class Iit{
    public static void main(String[] args) {
        // use diamond <> and concrete type on right side
        HashMap<Integer, Integer> map = new HashMap<>();

        System.out.println("hello");

        // declare arr before try if you want to use it after the try/catch
        int[] arr = {1, 2, 2, 7, 5, 2};

        try {
            // null should be lowercase; also variable must be declared as String
            String str = null;
            System.out.println(str); // prints "null"

            // accessing arr[3] here is safe (index 3 exists)
            System.out.println("Inside try -> arr[3] = " + arr[3]);

            // example that would throw NoSuchElement or similar could go here

        } catch (NullPointerException e) {
            // correct exception class name
            System.out.println("NullPointerException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (Exception e) {
                 // generic fallback (optional)
            System.out.println("Some other exception: " + e);
        } finally {
            // runs always (good for cleanup)
            System.out.println("Finally block executed.");
        }

        // arr is accessible here because it was declared outside the try
        System.out.println("Outside try -> arr[3] = " + arr[3]);
    }
}
