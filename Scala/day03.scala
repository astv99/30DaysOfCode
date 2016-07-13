object Solution {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    var n = sc.nextInt()

    // Write your code here
    if (n % 2 == 1) println("Weird")
    else {
      if (n >= 2 && n <= 5 || n > 20) println("Not Weird")
      if (n >= 6 && n <= 20) println("Weird")
    }
  }
}
