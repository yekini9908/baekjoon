n = int(input())
arr1 = list(map(int, input().split()))
m = int(input())
arr2 = list(map(int, input().split()))

arr3 = []

for i in range(m):
    if arr2[i] in arr1:
        arr3.append(1)
    else:
        arr3.append(0)

for j in arr3:
    print(j)