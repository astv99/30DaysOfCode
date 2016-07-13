import java.util.*;

class Student
{
    protected String firstName;
    protected String lastName;
    int phone;
    Student(String fname, String lname, int p) {
        firstName = fname;
        lastName = lname;
        phone = p;
    }
    public void display() { // display the details of the student
        System.out.println("First Name: " + firstName + "\nLast Name: " + lastName);
        System.out.println("Phone: " + phone);
    }

}

class Grade extends Student
{
    private int score;

    // Write your code here
    Grade(String fname, String lname, int ph, int sc) {
        super(fname, lname, ph);
        this.score = sc;
    }

    public String calculate() {
        if (this.score < 40)
            return "D";
        else if (this.score >= 40 && this.score < 60)
            return "B";
        else if (this.score >= 60 && this.score < 75)
            return "A";
        else if (this.score >= 75 && this.score < 90)
            return "E";
        else
            return "O";
    }
}

public class day12
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        int phone = sc.nextInt();
        int score = sc.nextInt();
        Student stu = new Grade(firstName, lastName, phone, score);
        stu.display();
        Grade g = (Grade)stu;
        System.out.println("Grade: " + g.calculate());
        
    }
}