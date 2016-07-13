# Enter your code here. Read input from STDIN. Print output to STDOUT
actual = [int(e) for e in raw_input().split(' ')]
expected = [int(e) for e in raw_input().split(' ')]

fine = 0
late_days = 0

if expected[2] >= actual[2]:
    if expected[1] >= actual[1]:
        if expected[0] >= actual[0]: # 5/9, 5/12
            fine += 0
        else:
            late_days = actual[0] - expected[0]
            fine += 15 * late_days
    else:
        late_months = actual[1] - expected[1]
        fine += 500 * late_months
else:
    fine += 10000

print fine