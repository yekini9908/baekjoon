# push X: 정수 X를 큐에 넣는 연산이다.
# pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
# size: 큐에 들어있는 정수의 개수를 출력한다.
# empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
# front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
# back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.

import sys
from collections import deque

n = int(sys.stdin.readline())
q = deque()

for i in range(n):
    a = list(sys.stdin.readline().split())
    if len(a) == 2:
        q.append(int(a[1]))
    else:
        if a[0]=='pop':
            if len(q) == 0:
                print(-1)
            else:
                print(q.popleft())
        elif a[0]=='size':
            print(len(q))
        elif a[0]=='empty':
            if len(q) == 0:
                print(1)
            else:
                print(0)
        elif a[0]=='front':
            if len(q) == 0:
                print(-1)
            else:
                print(q[0])
        elif a[0]=='back':
            if len(q) == 0:
                print(-1)
            else:
                print(q[-1])



