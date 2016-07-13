class Node:
    def __init__(self):
        self.data = None
        self.next = None
class Solution:
    def display(self, head):
        current = head
        while current:
            print current.data,
            current = current.next
    def insert(self, head, data): # complete this method
        if head == None:
            head = Node()
            head.data = data
        else:
            current = head
            while (current.next):
                current = current.next
            new_node = Node()
            new_node.data = data
            current.next = new_node
        return head

mylist = Solution()
T = int(input())
for i in range(T):
    data = int(input())
    head = mylist.insert(head, data)
mylist.display(head)