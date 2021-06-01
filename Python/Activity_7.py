lst = []
  

n = int(input("Enter Number of Elements In List : "))
  
for i in range(1, n+1):
    items = int(input("Enter Element No: " )) 
    lst.append(items) 

y=0;
for i in lst:
     x=i;
     i=0;
     y=x+y;  
print("Sum Of All Elements of the List is : " ,y)    
      




 
    
  
 