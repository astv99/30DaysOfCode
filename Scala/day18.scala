import scala.collection.mutable.Stack
import scala.collection.mutable.Queue

class Palindrome() {
  // Write your code here
  var stack = new Stack[Char]()
  var queue = new Queue[Char]()
  def pushCharacter(ch: Char): Unit = {
    stack.push(ch)
  }
  def enqueueCharacter(ch: Char): Unit = {
    queue.enqueue(ch)
  }
  def popCharacter(): Char = {
    return stack.pop()
  }
  def dequeueCharacter(): Char = {
    return queue.dequeue()
  }
}

object Solution {
  def main(args: Array[String]) {
    // read the string s
    var s = scala.io.StdIn.readLine()
    // create the Palindrome class object p
    var p = new Palindrome()
    var i = 0
    var len = s.length()
    // push all the characters of string s to stack
    for (i <- 0 to len-1) {
      p.pushCharacter(s.charAt(i))
    }
    // enqueue all the characters of string s to queue
    for (i <- 0 to len-1) {
      p.enqueueCharacter(s.charAt(i))
    }
    var f = true
    /*pop the top character from stack
      dequeue the first character from queue
      compare both the characters*/
    for (i <- 0 to len-1) {
      if (p.popCharacter() != p.dequeueCharacter()) f = false
    }
    // finally print whether string s is palindrome or not
    if (f) println("The word, " + s + ", is a palindrome.")
    else println("The word, " + s + ", is not a palindrome.")
  }
}
