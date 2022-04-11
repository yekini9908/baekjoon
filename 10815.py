n = int(input())
arr1 = list(map(int,input().split()))
dict1 = {string : 0 for string in arr1}
m = int(input())
arr2 = list(map(int,input().split()))

arr3 = []
for i in arr2:

    if i in dict1:
        arr3.append(1)
    else:
        arr3.append(0)
for j in arr3:
    print(j, end=' ')
