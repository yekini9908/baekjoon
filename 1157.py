# word = 'zZa'.upper()
word = input().upper()
word_list = list(set(list(word)))
c = []
for i in word_list:
    c.append(word.count(i))

max_list = [i for i, value in enumerate(c) if value == max(c)]


if len(max_list) > 1:
    print('?')
else:
    print(word_list[max_list[0]])
