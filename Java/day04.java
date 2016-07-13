import java.util.*;

// all instances of "day04" below renamed from Person
public class day04
{
    int age;	
	public day04(int initial_Age) {
  		// Add some more code to run some checks on initial_Age
        if (initial_Age < 0) {
            this.age = 0;
            System.out.println("This person is not valid, setting age to 0.");
        }
        else
            this.age = initial_Age;
	}

	public void amIOld() {
  		// Do some computations in here and print out the correct statement to the console 
        // using System.out.println()...
        if (this.age >= 13 && this.age < 18)
            System.out.println("You are a teenager.");
        else if (this.age < 13)
            System.out.println("You are young.");
        else
            System.out.println("You are old.");
	}

	public void yearPasses() {
  		// Increment the age of the person in here
        this.age += 1;
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            day04 p = new day04(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
    }
}