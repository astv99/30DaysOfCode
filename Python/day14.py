class Difference:
    def __init__(self, a):
        self.__elements = a
	# Add your code here
    def computeDifference(self):
        size = len(self.__elements)
        temp = []
        for i in range(size):
            for j in range(i+1, size):
                temp.append(abs(self.__elements[i] - self.__elements[j]))
        self.maximumDifference = max(temp)

_ = raw_input()
a = [int(e) for e in raw_input().split(' ')]

d = Difference(a)
d.computeDifference()

print d.maximumDifference