import java.util.*;

public class day16
{
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] list = new int[n];
        for (int i = 0; i < n; i++)
            list[i] = sc.nextInt();
        Arrays.sort(list);
        int currentMin = Math.abs(list[0] - list[1]);
        for (int i = 0; i < list.length-2; i++)
            if (Math.abs(list[i] - list[i+1]) < currentMin)
                currentMin = Math.abs(list[i] - list[i+1]);
        for (int j = 0; j < list.length-2; j++)
            if (Math.abs(list[j] - list[j+1]) == currentMin)
                System.out.print(list[j] + " " + list[j+1] + " ");
    }
}