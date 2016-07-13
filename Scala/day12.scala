class Student(first: String, last: String, ph: String) {
  val firstName: String = first
  val lastName: String = last
  val phone: String = ph

  def display() {
    println("First Name: " + firstName)
    println("Last Name: " + lastName)
    println("Phone: " + phone)
  }
}

class Grade(first: String, last: String, ph: String, sc: Int) extends Student(first, last, ph) {
  val score: Int = sc

  // Write your code here
  def calculate(): String = score match {
    case d if score < 40 => "D"
    case b if score >= 40 && score < 60 => "B"
    case a if score >= 60 && score < 75 => "A"
    case e if score >= 75 && score < 90 => "E"
    case _ => "O"
  }
}

object Solution {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val (firstName, lastName, phone) = (sc.next(), sc.next(), sc.next())
    val score = sc.nextInt()
    val stu = new Grade(firstName, lastName, phone, score)
    stu.display()
    println("Grade: " + stu.calculate)
  }
}
