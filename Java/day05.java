import java.math.*;
import java.util.*;

public class day05
{
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
           Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), n = sc.nextInt();
            int term = a;
            for (int j = 0; j < n; j++) {
                term += (int)Math.pow(2, j) * b;
                System.out.print(term + " ");
            }
            System.out.println();
        }
    }
}