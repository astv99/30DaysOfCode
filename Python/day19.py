from abc import ABCMeta, abstractmethod

class AdvancedArithmetic():
    __metaclass__ = ABCMeta
    @abstractmethod
    def divisorSum(self, n):
        pass

# Write your code here
class Calculator(AdvancedArithmetic):
    def divisorSum(self, n):
        sum = 0
        if (n >= 1):
            sum += n
        for i in range(1, (n/2)+1):
            if (n % i == 0):
                sum += i
        return sum

n = int(raw_input())
myCalculator = Calculator()
sum = myCalculator.divisorSum(n)
print "I implemented: AdvancedArithmetic\n", sum