// Enter your code here. Read input from STDIN. Print output to STDOUT
import scala.io.StdIn

object Solution {
  def main(args: Array[String]) {
    val n = StdIn.readInt()
    val a = StdIn.readLine().trim().split(" ").map(x=>x.toInt).toList
    val sortedList = a.sorted
    var currentMin = Math.abs(sortedList(0) - sortedList(1))
    for (i <- 0 to a.size-2)
      if (Math.abs(sortedList(i) - sortedList(i+1)) < currentMin)
        currentMin = Math.abs(sortedList(i) - sortedList(i+1))
    for (i <- 0 to a.size-2)
      if (Math.abs(sortedList(i) - sortedList(i+1)) == currentMin)
        print(sortedList(i) + " " + sortedList(i+1) + " ")
  }
}
