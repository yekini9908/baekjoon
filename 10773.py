import sys

n = int(sys.stdin.readline())
st = []

for i in range(n):
    a = int(sys.stdin.readline())
    if a==0:
        st.pop()
    else:
        st.append(a)

print(sum(st))
