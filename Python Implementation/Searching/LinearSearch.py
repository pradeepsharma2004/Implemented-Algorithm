#Linear Search

def linear(list,n):#linear seach function
    for i in range(len(list)):
        if n==l[i]:
            return i+1


n=input('Enter No of Element in your list(In numeric)\n')#input length of size
l=[]
#input list n elements
for i in range(int(n)):
    l1=input('Enter Your '+str(i+1)+' Element\n')
    l.append(l1)
print('Your List is ',l)
num=input('Enter your Element To search\n')
#passing list and num to be searched in list
pos=linear(l,num)
if pos==None:
    print('not present')
else:
    print('present at location:-',pos)

