n = int(input())
arr = []
for _ in range(n):
    arr.append(input())

s = set(arr)
a = list(s)
arr = sorted(a, key = lambda x : (len(x),x))
for i in range(len(arr)):
    print(arr[i])


