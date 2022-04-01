from collections import deque

# n = int(input())
n = 6

a = list(range(n, 0, -1))
deq = deque(a)
# a = list(range(1,n+1))

for _ in range(n-1):
    deq.pop()
    deq.appendleft(deq[-1])
    deq.pop()


print(deq[0])