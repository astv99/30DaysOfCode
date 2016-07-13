import java.util.*;

public class day20
{
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringTokenizer tokens = new StringTokenizer(input, "[!,?.\\_'@ ]+");
        System.out.println(tokens.countTokens());
        while (tokens.hasMoreTokens()) {
            System.out.println(tokens.nextToken());
        }
        
    }
}