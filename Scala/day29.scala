object Solution {
  def main(args: Array[String]) {
    // Write your code here
    val sc = new java.util.Scanner(System.in)
    var funny = true
    val T = sc.nextInt()
    for (i <- 1 to T) {
      val raw_str = sc.next()
      val reversed_str = raw_str.reverse
      for (j <- 1 to raw_str.length()-1) {
        if (Math.abs(raw_str(j).toInt - raw_str(j-1).toInt) !=
          Math.abs(reversed_str(j).toInt - reversed_str(j-1).toInt))
          funny = false
      }
      if (funny) println("Funny") else { println("Not Funny"); funny = true }
    }
  }
}
