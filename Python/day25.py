# Enter your code here. Read input from STDIN. Print output to STDOUT
import math

def isPrime(n):
    if n == 1:
        return False
    elif n == 2 or n == 3:
        return True
    elif n % 2 == 0 or n % 3 == 0:
        return False
    for i in range(2, int(math.sqrt(n))):
        if n % i == 0:
            return False
    return True

T = int(input())
for i in range(T):
    n = int(input())
    if isPrime(n):
        print "Prime"
    else:
        print "Not prime"