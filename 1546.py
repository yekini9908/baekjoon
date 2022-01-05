
n = int(input())
a = list(map(int, input().split()))

ma = max(a)
for i in range(n):
    a[i] = a[i]/ma*100

print(sum(a)/n)


