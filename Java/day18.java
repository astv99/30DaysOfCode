import java.io.*;
import java.util.*;

class Palindrome
{
    // Write your code here
    private Deque<Character> stack;
    private Queue<Character> queue;

    public Palindrome() {
        stack = new LinkedList<>();
        queue = new LinkedList<>();
    }

    public void pushCharacter(char ch) {
        this.stack.push(Character.valueOf(ch));
    }

    public void enqueueCharacter(char ch) {
        this.queue.add(Character.valueOf(ch));
    }

    public char popCharacter() {
        return this.stack.pop().charValue();
    }

    public char dequeueCharacter() {
        return this.queue.poll().charValue();
    }
}

public class day18
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        Palindrome p = new Palindrome();
        char arr[] = s.toCharArray();
        for (char c : arr) {
            p.pushCharacter(c);
        }
        
        for (char c : arr) {
            p.enqueueCharacter(c);
        }
        
        boolean f = true;
        
        for (int i = 0; i < s.length(); i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                f = false;                
                break;
            }
        }
        
        if (f) {
            System.out.println("The word, " + s + ", is a palindrome.");
        } else {
            System.out.println("The word, " + s + ", is not a palindrome.");
        }
    }
}