import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day02
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double M = sc.nextDouble(); // original meal price
        int T = sc.nextInt(); // tip percentage
        int X = sc.nextInt(); // tax percentage

        // Enter your code here!
        // Run some computations....
      
        int total = (int) Math.round(M + ((M * T) / 100) + ((M * X) / 100));
      
        System.out.println("The final price of the meal is $" + total + ".");
    }
}