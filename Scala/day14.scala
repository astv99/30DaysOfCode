import scala.io.StdIn

class Difference(a: List[Int]) {
  val elements: List[Int] = a
  var maximumDifference: Int = 0

  // Add your code here
  def computeDifference(): Unit = {
    val sortedList = elements.sorted
    maximumDifference = sortedList(sortedList.size-1) - sortedList(0)
  }
}

object Solution {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val _ = sc.nextInt()
    val a = StdIn.readLine().trim().split(" ").map(x=>x.toInt).toList
    val d = new Difference(a)
    d.computeDifference()
    print(d.maximumDifference)
  }
}
