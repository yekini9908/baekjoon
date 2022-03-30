import sys

n = int(input())
arr = []


for _ in range(n):
    a, b = sys.stdin.readline().split()
    a = int(a)
    b = int(b)
    arr.append([a, b, 1])

for i in range(n):
    for j in range(n):
        if i == j:
            pass
        if arr[i][0] < arr[j][0] and arr[i][1] < arr[j][1]:
            arr[i][2] = arr[i][2] + 1

for k in range(n):
    print(arr[k][2], end=' ')


