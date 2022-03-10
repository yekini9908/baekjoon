# n = int(input())
# arr = list(map(int,input().split()))
import sys

n = int(sys.stdin.readline())
st = []


for i in range(n):
    a = sys.stdin.readline()
    if "push" in a:
        p = a.split()
        st.append(int(p[-1]))
        print("stack",st)

    elif "pop" in a:
        if len(st)==0:
            print(-1)
        else:
            print(st.pop())
    elif "size" in a:
        print(len(st))
    elif "empty" in a:
        if len(st)==0:
            print(1)
        else:
            print(0)
    elif "top" in a:
        if len(st)==0:
            print(-1)
        else:
            print(st[-1])

