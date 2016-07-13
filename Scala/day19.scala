trait AdvancedArithmetic {
  def divisorSum(n: Int): Int
}

// Write your code here
class Calculator extends AdvancedArithmetic {
  def divisorSum(n: Int): Int = {
    var sum = 0
    if (n >= 1) sum += n
    for (i <- 1 to n/2) {
      if (n % i == 0) sum += i
    }
    return sum
  }
}

object Solution {
  def main(args: Array[String]) {
    val n = scala.io.StdIn.readInt()
    val myCalculator = new Calculator
    val sum = myCalculator.divisorSum(n)
    println("I implemented: AdvancedArithmetic\n" + sum)
  }
}
