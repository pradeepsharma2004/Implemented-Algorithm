#Binary Search
def binary(l,n):#binary search function
    found=0
    first=0
    last=int(len(l))-1
    while first<=last:
        mid=int((first+last)/2)
        if l[mid]==n:
            return mid+1
        elif l[mid]>n:
            last=mid-1    
        else:
            first=mid+1
    return found
n=input('Enter No of Element in your list(In numeric)\n')#input length of size
l=[]
#input list n elements
for i in range(int(n)):
    l1=input('Enter Your '+str(i+1)+' Element\n')
    l.append(l1)
print('Your List is ',l)
l.sort()
print('Your sorted list',l)
num=input('Enter your Element To search\n')
#passing list and num to be searched in list
pos=binary(l,num)
if pos==None:
    print('not present')
else:
    print('present at location:-',pos)
