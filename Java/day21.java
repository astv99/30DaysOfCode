import java.io.IOException;
import java.lang.reflect.Method;

class Printer {
    // Write your code here
    static <T> void printArray(T[] a) {
        for (T it : a)
            System.out.println(it);
    }
}

public class day21
{
    public static void main(String[] args) {
        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;
		for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();
            if (name.equals("printArray"))
              count++;
        }
        
        if (count > 1) System.out.println("Method overloading is not allowed!");
        assert count == 1;
    }
}