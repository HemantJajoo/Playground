n = int(input())
s = int(input())
scores = list(map(int,input().split()))
scores = sorted(scores,reverse = True)
#print(scores)
sum = 0
for i in range(s):
  sum += scores[i]
print(sum)