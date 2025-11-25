// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class SumArray {
    public SumArray() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int var2 = var1.nextInt();
        int[] var3 = new int[var2];
        int var4 = 0;
        System.out.println("Enter elements:");

        for(int var5 = 0; var5 < var2; ++var5) {
            var3[var5] = var1.nextInt();
            var4 += var3[var5];
        }

        System.out.println("Sum = " + var4);
    }
}
