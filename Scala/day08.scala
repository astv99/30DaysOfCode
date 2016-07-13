import scala.io.StdIn

object Solution {
  def main(args: Array[String]) {
    // Write your code here
    val sc = new java.util.Scanner(System.in)
    var phonebook = scala.collection.mutable.Map[String, Int]()

    val N = StdIn.readInt()
    for (i <- 1 to N) {
      val name = StdIn.readLine()
      val phone = StdIn.readInt()
      phonebook(name) = phone
    }
    var name = StdIn.readLine()
    while (name != null) {
      if (phonebook.contains(name)) println(name + "=" + phonebook(name))
      else println("Not found")
      name = StdIn.readLine()
    }

  }
}
