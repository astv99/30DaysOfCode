import scala.io.StdIn // added to avoid a deprecation warning for readLine()

object Solution {
  def gcd(x: Int, y: Int): Int = {
    // You only need to fill up this function
    // To return the value of the GCD of x and y
    if (x == y || y == 0) x else gcd(y, x % y)
  }

  /** This part handles the input/output. Do not change or modify it **/
  def acceptInputAndComputeGCD(pair: List[Int]) = {
    println(gcd(pair.head, pair.reverse.head))
  }

  /** The part relates to the input/output. Do not change or modify it **/
  def main(args: Array[String]) {
    acceptInputAndComputeGCD(StdIn.readLine().trim().split(" ").map(x=>x.toInt).toList)
  }
}
