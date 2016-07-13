// Write your code here
class Printer {
  def printArray[T](a: List[T]): Unit = {
    a.foreach(println)
  }
}

object Solution {
  def main(args: Array[String]) {
    val myPrinter = new Printer
    val intArray = List(1, 2, 3)
    val stringArray = List("Hello", "World")
    myPrinter.printArray(intArray)
    myPrinter.printArray(stringArray)
  }
}
