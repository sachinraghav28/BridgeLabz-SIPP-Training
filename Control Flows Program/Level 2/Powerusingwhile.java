import java.util.*;
public class PowerUsingWhile {
    public static void main(String[] args) {
        int base=2;
        int exponent=3;
        int result=1;
        int i =1;
        while (i < exponent) {
            result *= base;
            i++;
        }
        System.out.println("Result: " + result);
    }
    
}
