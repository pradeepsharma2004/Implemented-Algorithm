#Insertion Sort Implementation
n=int(input('Enter Number of elements in array'))

arr=list()

for i in range(0,n):
    arr.append(int(input()))

print('your given set of elements:',arr)

def insertion_sort(l:list):
    for i in range(1,len(l)):
        key=l[i]
        j=i-1
        while(j>0 and l[j]>key):
            l[j+1]=l[j]
            j=j-1
        l[j+1]=key
    return l

print(insertion_sort(arr))


