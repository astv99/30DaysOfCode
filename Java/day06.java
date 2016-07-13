import java.util.*;

public class day06
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // Write your code here
        int k = 1;
        while (n > 0) {
            for (int i = n-1; i >= 1; i--)
                System.out.print(" ");
            for (int j = 0; j < k; j++)
                System.out.print("#");
            System.out.println();
            k += 1;
            n -= 1;
        }
    }
}