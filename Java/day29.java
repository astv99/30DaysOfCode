import java.math.*;
import java.util.*;

public class day29
{
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        boolean funny = true;
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            String raw_str = sc.next();

            char[] str = raw_str.toCharArray();
            StringBuilder reversed_str_1 = new StringBuilder(raw_str);
            String reversed_str_2 = new String(reversed_str_1.reverse());
            char[] reversed_str = reversed_str_2.toCharArray();

            for (int j = 1; j < reversed_str.length; j++) {
                if (Math.abs((int)str[j] - (int)str[j-1]) !=
                    Math.abs((int)reversed_str[j] - (int)reversed_str[j-1]))
                    funny = false;
            }

            if (funny)
                System.out.println("Funny");
            else {
                System.out.println("Not Funny");
                funny = true;
            }
        }
    }
}