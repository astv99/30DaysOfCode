import scala.util.matching.Regex

object Solution {
  def main(args: Array[String]) {
    // Write your code here
    val str: String = scala.io.StdIn.readLine()
    val pattern = "[^\\W_]+".r
    val words = pattern.findAllIn(str).toArray
    println(words.size)
    words.foreach(println)
  }
}
