import java.util.*;

public class day10
{
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int arg = sc.nextInt(), divisor = 2;
            int quotient = arg;
            Stack<Integer> bin = new Stack<Integer>();
            while (quotient > 0) {
                int mod = quotient % divisor;
                bin.push(mod);
                quotient /= divisor;
            }
            for (int j = bin.size()-1; j >= 0; j--)
                System.out.print(bin.get(j));
            System.out.println();
        }
    }
}