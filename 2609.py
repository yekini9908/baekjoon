arr = list(map(int,input().split()))
# arr = [2, 2]
a = 1
b = min(arr) * max(arr)
for i in range(min(arr),1,-1):
    if arr[0] % i ==0 and arr[1] % i==0:
        a = i
        break

for j in range(max(arr),max(arr)*min(arr),max(arr)):
    if j % min(arr) == 0:
        b = j
        break
print(a)
print(b)