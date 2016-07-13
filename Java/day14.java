import java.util.*;

class Difference {
  	private int[] elements;
  	public int maximumDifference;
    // Add your code here
    Difference(int[] a) {
        elements = new int[a.length];
        for (int i = 0; i < a.length; i++)
            elements[i] = a[i];
    }

    public void computeDifference() {
        Arrays.sort(elements);
        maximumDifference = elements[elements.length-1] - elements[0];
    }

} // End of Difference class

public class day14
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        Difference D = new Difference(a);

        D.computeDifference();

        System.out.print(D.maximumDifference);
    }
}