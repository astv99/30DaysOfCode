class Student:
    def __init__(self, firstName, lastName, phone):
        self.firstName = firstName
        self.lastName = lastName
        self.phone = phone
    def display(self):
        print "First Name:", self.firstName
        print "Last Name:", self.lastName
        print "Phone:", self.phone

class Grade(Student):
    def __init__(self, firstName, lastName, phone, score):
        Student.__init__(self, firstName, lastName, phone)
        self.score = score

    # Write your code here
    def calculate(self):
        if self.score < 40:
            return "D"
        elif self.score >= 40 and self.score < 60:
            return "B"
        elif self.score >= 60 and self.score < 75:
            return "A"
        elif self.score >= 75 and self.score < 90:
            return "E"
        elif self.score >= 90 and self.score <= 100:
            return "O"

firstName = raw_input().strip()
lastName = raw_input().strip()
phone = int(raw_input())
score = int(raw_input())
stu = Grade(firstName, lastName, phone, score)
stu.display()
print "Grade:", stu.calculate()