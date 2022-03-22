import sys
n = int(sys.stdin.readline())
result = 0

for i in range(n):
    a = sys.stdin.readline()
    word = list(a)
    c = 0
    temp = []
    temp.append(word[0])

    for j in range(1,len(word)):
        if word[j] == temp[-1] :
            temp.append(word[j])
            c = c + 1
        elif word[j] not in temp:
            temp.append(word[j])
            c = c + 1
        else:
            break
    if c == len(word)-1:
        result = result + 1


print(result)




