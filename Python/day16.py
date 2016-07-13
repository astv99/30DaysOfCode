# Enter your code here. Read input from STDIN. Print output to STDOUT
# a = [-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854, -520, -470]
_ = raw_input()
a = [int(e) for e in raw_input().split(' ')]
sortedList = sorted(a)
length = len(sortedList)
currentMin = abs(sortedList[0] - sortedList[1])
for i in range(length-1):
    if abs(sortedList[i] - sortedList[i+1]) < currentMin:
        currentMin = abs(sortedList[i] - sortedList[i+1])
for i in range(length-1):
    if (abs(sortedList[i] - sortedList[i+1]) == currentMin):
        print sortedList[i], sortedList[i+1],

# Methods below not used, since Python's built-in sort is used instead
def insertionSort(mList):
    for i in range(1, len(mList)):
        key = mList[i]
        j = i-1
        while (j >= 0 and key < mList[j]):
            mList[j+1] = mList[j]
            j -= 1
        mList[j+1] = key
    return mList

# Merge Sort: Top-down implementation using lists, from Wikipedia
def merge(left, right):
    result = []
    while (left and right):
        if (left[0] <= right[0]):
            result.append(left[0])
            left = left[1:]
        else:
            result.append(right[0])
            right = right[1:]
    while (left):
        result.append(left[0])
        left = left[1:]
    while (right):
        result.append(right[0])
        right = right[1:]
    return result

def mergeSort(mList):
    if (len(mList) <= 1):
        return mList
    left, right = [], []
    for i in range(len(mList)):
        if (i % 2 == 1):
            left.append(mList[i])
        else:
            right.append(mList[i])
    left = mergeSort(left)
    right = mergeSort(right)
    return merge(left, right)