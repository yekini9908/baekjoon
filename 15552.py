import sys

n = int(sys.stdin.readline())

for _ in range(n):
    a ,b= sys.stdin.readline().split()
    a,b = int(a), int(b)
    print(a+b)
