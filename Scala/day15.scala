class Node(d: Int) {
  var data: Int = d
  var next: Node = null
}

class NodeLinkedList {
  def display(head: Node): Unit = {
    var start: Node = head
    while (start != null) {
      print(start.data + " ")
      start = start.next
    }
  }

  def insert(head: Node, data: Int): Node = { // complete this method
    if (head == null) {
      val new_head: Node = new Node(data)
      return new_head
    }
    else {
      var current: Node = head
      while (current.next != null) current = current.next
      val new_node: Node = new Node(data)
      current.next = new_node
      return head
    }
  }
}

object Solution {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val list: NodeLinkedList = new NodeLinkedList
    var head: Node = null
    var T: Int = sc.nextInt()
    for (i <- 1 to T) {
      var e = sc.nextInt()
      head = list.insert(head, e)
    }

    list.display(head)
  }
}
