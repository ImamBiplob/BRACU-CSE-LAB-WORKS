j = 2
list = []
for j in range(4):
    print(j)
list=[0,1,[2,3]]
print(list[2][1])
genmax = 90
print("No fittest child in ", genmax, "generation")

def backkor(i,j):
    x,y=i,j
    return x,y
k,l = 1,2
i,j = backkor(k,l)
print(i)

