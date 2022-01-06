a = []
n = int(input())

for _ in range(n):
    i = int(input())
    a.append(i)


a.sort()

for j in range(n):
    print(a[j])
