rm(list=ls())

#to create a vector ...c() or scan()
name=scan(what="character") # or "char" or 'char' or 'character'
# be default sep=" " 
name

# to combine vectors
prime=scan()
a=c(3,5,3,1,3,4,7,9,3,1)
club=c(a,prime,34,23,76)
club

# to check the no. of elements
length(club)

# How to define name for every element in a vector
a1=c(r1="red",r2="blue",r3="black",r4="yellow")
a1
names(a1) # to extract the names in a vector
class(names(a1))


# to remove the quotes from a char type vector 
# cat() command
# print() command to print a char type text

cat(print("Hello everyone!"))

# print $  what is "R" ? $
# to print " , use \" .. quote character
cat(print("what is \"R\" ? "))


c(1:10,34,657,2)

# seq() i.e. sequence
#syntax seq(from=a,to=b,by=d)

seq(1,10,3)
seq(1,10) # common diff=1 ,  by default length=10
1:10 # alternative
 
seq(1,10,length=15)
# create a vector (-1,-2,-3,...-10) in two ways

#example() command
example(seq)
example(rep)

# rep() i.e. replicate
#syntax: rep(arg1,arg2)

# when arg2 is a single number
x=c(7,8,9)
rep(x,3)
rep(x,times=3)

# when arg2 is a vector
x=c(2,3,4)
#(2,2,3,3,3,4,4,4,4)
rep(x,c(2,3,4))
rep(x,x)
rep(x,2:4)

rep(1:2,c(3,4)) 
rep(1:2,c(4,4))
rep(1:2,each=4)

# paste () is for concatenation of two vectors elementwise
paste(1:3,4:6) # length is same and no sep (i.e. space is by default)

paste(1:2,3:7) # length is diff 
paste(3:7,1:2)

# combine char vector with integer vector
paste(c("a","b","c"),1:3)
# in case of sep
paste(c("a","b","c"),1:3,sep="")
paste(c("a","b","c"),1:3,sep=",")

