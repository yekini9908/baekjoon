import sys
n, m = sys.stdin.readline().split()
n = int(n)
m = int(m)
mini = 300001
result = 0
arr = list(map(int,input().split()))

for i in range(0,n-2):
    for j in range(i+1,n-1):
        for k in range(j+1,n):
            s = arr[i] + arr[j] + arr[k]
            mi = m - s
            if mi < 0:
                pass
            if s <= m and mi < mini:
                mini = mi
                result = s


print(result)


