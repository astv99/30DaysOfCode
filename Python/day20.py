# Enter your code here. Read input from STDIN. Print output to STDOUT
import re

str = raw_input()
words = [x for x in re.split("[\W_]+", str) if x]
print len(words)
for w in words:
    print w

# This alternate implementation also works:
# words = re.split("[^A-Za-z]+", str)
# words = list(filter(None, words))