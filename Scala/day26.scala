object Solution {
  def main(args: Array[String]) {
    // Write your code here
    val sc = new java.util.Scanner(System.in)
    var actual = new Array[Int](3)
    var expected = new Array[Int](3)
    var fine = 0

    for (i <- 0 to 2) actual(i) = sc.nextInt()
    for (i <- 0 to 2) expected(i) = sc.nextInt()

    if (expected(2) >= actual(2)) {
      if (expected(1) >= actual(1)) {
        if (expected(0) >= actual(0)) fine += 0 else fine += 15 * (actual(0) - expected(0))
      } else fine += 500 * (actual(1) - expected(1))
    } else fine += 10000

    println(fine)
  }
}
