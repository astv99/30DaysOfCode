// This code does not currently work correctly; could not correctly translate
// the insert() method to Scala's functional paradigm

// Working solutions implemented in Python and Java, see day23.py & day23.java

import scala.collection.mutable.Queue

class Node(d: Int) {
  var left : Node = null
  var right : Node = null
  var data : Int = d
}

object Solution {
  def insert(root: Node, d: Int): Node = {
    if (root == null) {
      val new_node: Node = new Node(d)
      return new_node
    }
    else {
      var root_copy: Node = new Node(root.data)
      var curr: Node = new Node(d)
      if (d <= root_copy.data) {
        curr = insert(root_copy.left, d)
        root_copy.left = curr
      }
      else {
        curr = insert(root_copy.right, d)
        root_copy.right = curr
      }
      return root_copy
    }
  }

  def levelOrder(root: Node): Int = {
    // Write your code here
    if (root == null) 0
    else {
      var q = Queue[Node]()
      q += root
      while (!q.isEmpty) {
        print(q(0).data + " ")
        val node: Node = q.dequeue
        if (node.left != null) q.enqueue(node.left)
        if (node.right != null) q.enqueue(node.right)
      }
      return 1
    }
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val T: Int = sc.nextInt()
    var root: Node = null
    for (i <- 1 to T) {
      val data = sc.nextInt()
      root = insert(root, data)
    }
    val order: Int = levelOrder(root)
  }
}
