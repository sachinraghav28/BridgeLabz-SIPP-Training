// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

class Main {
   Main() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter the size of the array:");
      int var2 = var1.nextInt();
      int[] var3 = new int[var2];
      System.out.println("Enter " + var2 + " numbers:");

      int var4;
      for(var4 = 0; var4 < var2; ++var4) {
         var3[var4] = var1.nextInt();
      }

      System.out.println("Sorted array:");

      for(var4 = 0; var4 < var2; ++var4) {
         System.out.print(var3[var4] + " ");
      }

   }
}
