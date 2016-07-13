import scala.io.StdIn // added to avoid a deprecation warning for readLine()
import scala.collection.mutable.Stack

object Solution {
  def main(args: Array[String]) {
    // Write your code here
    val t = StdIn.readLine()
    for (_ <- 1 to t.toInt) {
      val dec = StdIn.readLine()
      val (arg, divisor) = (dec.toInt, 2)
      var quotient = arg
      var bin = Stack[Int]()
      while (quotient > 0) {
        val mod = quotient % divisor
        bin.push(mod)
        quotient /= divisor
      }
      bin.foreach(print)
      println()
    }
  }
}
