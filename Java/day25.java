// Enter your code here. Read input from STDIN. Print output to STDOUT
import java.math.*;
import java.util.*;

public class day25
{
    public boolean isPrime(int n) {
        if (n == 1)
            return false;
        else if (n == 2 || n == 3)
            return true;
        else if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 2; i < (int)Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        day25 Solution = new day25();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            if (Solution.isPrime(n))
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
    }
}