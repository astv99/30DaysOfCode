import java.util.Scanner;
import java.util.regex.*;

public class day28
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            // Write your code here
            try {
                String pattern = in.nextLine();
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
            testCases -= 1;
        }
    }
}
