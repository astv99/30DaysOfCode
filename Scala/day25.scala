// Enter your code here. Read input from STDIN. Print output to STDOUT
object Solution {
  def isPrime(n: Int): Boolean = {
    if (n == 1) return false
    else if (n == 2 || n == 3) return true
    else if (n % 2 == 0 || n % 3 == 0) return false
    for (i <- 2 to math.sqrt(n).toInt) {
      if (n % i == 0) return false
    }
    return true
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val T: Int = sc.nextInt()
    var n: Int = 0
    for (i <- 1 to T) {
      n = sc.nextInt()
      if (isPrime(n)) println("Prime") else println("Not prime")
    }
  }
}
