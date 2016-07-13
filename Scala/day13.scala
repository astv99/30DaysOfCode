abstract class Book(t: String, a: String) {
  var title: String = t
  var author: String = a

  def display()
}

// Write MyBook class
class MyBook(t: String, a: String, p: Int) extends Book(t, a) {
  var price: Int = p

  def display(): Unit = {
    System.out.println("Title: " + this.title)
    System.out.println("Author: " + this.author)
    System.out.println("Price: " + this.price)
  }
}

object Solution {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val (title, author) = (sc.nextLine(), sc.nextLine())
    val price = sc.nextInt()
    val new_novel = new MyBook(title, author, price)
    new_novel.display()
  }
}
