n = int(input())

arr = []
for _ in range(n):
    a,b = map(int,input().split())
    arr.append([a,b])

arr2 = sorted(arr,key=lambda x:(x[1],x[0]))
for i in range(n):
    print(arr2[i][0],arr2[i][1])