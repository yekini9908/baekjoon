n = int(input())

for _ in range(n):
    arr = list(map(int,input().split()))
    n = arr[0]
    del arr[0]
    avg = sum(arr) / n
    re = []
    for i in arr:
        if i > avg:
            re.append(i)
    if len(re)==0:
        print('0.000%')
    else:
        print('%.3f%%'%(len(re)/n*100))