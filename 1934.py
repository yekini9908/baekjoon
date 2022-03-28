n = int(input())

for _ in range(n):
    a,b=map(int,input().split())
    m = max(a,b)
    ma = 0
    for i in range(1,min(a,b)+1):
        ma = m * i
        if ma % a == 0 and ma % b == 0:
            print(ma)
            break



