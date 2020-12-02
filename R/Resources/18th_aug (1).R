#18thaug2020
# R as calculator
# to get the output, press: ctrl+enter
# > is known as promt.
# R is a numerical software

2+3 # addition
2-5 # subtraction
2* 34 # multi
10^0.324 # power
2/5 # division 
6%%5 # for reminder

# type of variables
#interger,numeric,char,logical and complex

# few commands
pi
exp(1)
log(10,10)
log10(10)
sin(pi/2)
asin(1/2)
pi/6
sin(45) # argument is in radian
sin(45*(pi/180))
1/sqrt(2)



# packages

# to see inbuild packages
search() 
searchpaths() # paths of packages

#to install a package
library(ggplot2)
install.packages("ggplot2")

# finding mean of a numbers from 1 to 10
x=1:10
mean(x)


# Help commands
help(mean) # argument is without quotes
? mean # alternative of help

help.search("mean") # argument will be with quotes
?? "mean"  # alternative of help.search

# note the difference in the outputs of ? and ?? 

help.start()

apropos("mean")

# to create a vector
r1=c(2.3,6.3,2.5)
r2=c("r1","r2","r3","r4")
r3=c(T,F,T,T)

# to check the class 
class(r1)
class(r2)
class(r3)

# mixed type
a1=c(T,"T",4)
class(a1)
a1
a2=c(T,0,F)
a2
class(a2)

# a:b-> no.s from a to b with difference 1

mark1=c(23,54,29,36,79,54)
mark2=scan()
mark2
name=scan()

name=scan(what="char")
name

marks=scan(sep=",")
marks
class(name)
class(marks)


#Ques:  create objects of all 5 types.. using c() and scan() 
#with sep as well as without sep command.

c1=c(name,marks)
c1 # char type data
