import java.io.*;
import java.util.*;

interface AdvancedArithmetic {
   int divisorSum(int n);
}

// Write your code here
class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int sum = 0;
        if (n >= 1) { sum += n; }
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) { sum += i; }
        }
        return sum;
    }
}

public class day19
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: AdvancedArithmetic\n" + sum);
    }
}