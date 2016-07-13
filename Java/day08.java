import java.util.*;

public class day08
{
    public static void main(String[] args) {
        // Write your code here
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> phonebook = new HashMap<String, Integer>();

        int N = in.nextInt();
        in.nextLine();
        for (int i = 0; i < N; i++) {
            String input_name = in.nextLine();
            int phone = in.nextInt();
            phonebook.put(input_name, phone);
            in.nextLine();
        }

        String test_name = in.nextLine();
        while (!test_name.isEmpty()) {
            if (phonebook.containsKey(test_name))
                System.out.println(test_name + "=" + phonebook.get(test_name));
            else
                System.out.println("Not found");
            test_name = in.nextLine();
        }
    }
}