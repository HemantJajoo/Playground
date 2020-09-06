l= list(input().split())
count =0
for i in l:
  if i == i[::-1]:
    count +=1
print(count)