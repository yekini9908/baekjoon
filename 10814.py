import sys

n = int(input())
arr = []

for i in range(n):
    a, b = sys.stdin.readline().split()
    a = int(a)
    arr.append([a,b,i])


f = sorted(arr, key = lambda x : (x[0], x[2]))

for j in range(n):
    print(f[j][0],f[j][1])