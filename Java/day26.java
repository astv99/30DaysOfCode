// Enter your code here. Read input from STDIN. Print output to STDOUT
import java.util.*;

public class day26
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] actual = new int[3];
        int[] expected = new int[3];
        int fine = 0;
        int late_days = 0;

        for (int i = 0; i < 3; i++)
            actual[i] = sc.nextInt();
        for (int i = 0; i < 3; i++)
            expected[i] = sc.nextInt();

        if (expected[2] >= actual[2]) {
            if (expected[1] >= actual[1]) {
                if (expected[0] >= actual[0])
                    fine += 0;
                else {
                    late_days = actual[0] - expected[0];
                    fine += 15 * late_days;
                }
            } else {
                fine += 500 * (actual[1] - expected[1]);
            }
        } else {
            fine += 10000;
        }

        System.out.println(fine);
    }
}