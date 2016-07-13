object Solution {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    var arr = Array.ofDim[Int](6, 6)
    for (i <- 0 to 5) {
      for (j <- 0 to 5) {
        arr(i)(j) = sc.nextInt()
      }
    }

    // Write your code here
    var max = -64
    for (i <- 1 to 4) {
      for (j <- 1 to 4) {
        var sum = arr(i)(j)
        sum += arr(i-1)(j-1) + arr(i-1)(j) + arr(i-1)(j+1)
        sum += arr(i+1)(j-1) + arr(i+1)(j) + arr(i+1)(j+1)
        if (sum > max) max = sum
      }
    }

    println(max)
  }
}
