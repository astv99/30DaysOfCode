# Enter your code here. Read input from STDIN. Print output to STDOUT
funny = True
T = int(input())
for i in range(T):
    str = raw_input()
    reversed_str = str[::-1]
    for j in range(1, len(str)):
        if abs(ord(str[j]) - ord(str[j-1])) != \
            abs(ord(reversed_str[j]) - ord(reversed_str[j-1])):
            funny = False
    if funny:
        print "Funny"
    else:
        print "Not Funny"
        funny = True