
N, K = map(int, input().split())
ls = []
result = 0
ex = K


for i in range(0, N):
    ls.append(int(input()))

ls.reverse()

for j in range(0,N):
    if ex <= 0:
        break
    else:
        if ex < ls[j]:
            pass
        else:
            while ex>=ls[j]:
                ex = ex - ls[j]
                result = result + 1

print(result)