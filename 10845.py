# push X: 정수 X를 큐에 넣는 연산이다.
# pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
# size: 큐에 들어있는 정수의 개수를 출력한다.
# empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
# front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
# back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.

import sys

n = int(sys.stdin.readline())
q = []


for i in range(n):
    a = sys.stdin.readline()
    if "push" in a:
        p = a.split()
        q.append(int(p[-1]))
    elif "pop" in a:
        if len(q)==0:
            print(-1)
        else:
            print(q.pop(0))
    elif "size" in a:
        print(len(q))
    elif "empty" in a:
        if len(q)==0:
            print(1)
        else:
            print(0)
    elif "front" in a:
        if len(q)==0:
            print(-1)
        else:
            print(q[0])
    elif "back" in a:
        if len(q)==0:
            print(-1)
        else:
            print(q[-1])
