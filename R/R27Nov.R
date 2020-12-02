# 1.
# (a)
x1 = read.csv(file.choose())
x1
# (b)
sd(x1[,1])
mean(x1[2,])
# (c)
mat=as.matrix(x1)
mat
class(mat)
apply(mat,2,var)
# (d)
attach(x1)
sum(x1[,3])
length(x1[,3])
detach(x1)
# (e)
attach(x1)
apply(x1,2,str)
plot(x1,main="data frame plot", col="red",type="o")
box()
detach(x1)

#2
#(a)
Golden = c(4,1,21,89)
Silver = c(37,18,27,45)
Platinum = c(90,5,4,5)
Wooden = c(15,28,23,34)
bird = data.frame(Golden,Silver, Platinum, Wooden)
bird
matrix = as.matrix(bird)
matrix
class(matrix)

#(b)
Bird_lst = list(matrix[1,],matrix[2,],matrix[3,],matrix[4,])

class(Bird_lst)
names(Bird_lst ) = c("Golden","Silver","Platinum","Wooden")
Bird_lst
#c
Diag = diag(matrix)
Diag
diag_matrix = diag(Diag)
diag_matrix

# 3.
# (a)
score <- floor(runif(100, min = 1, max = 100))
record <- floor(rnorm(100, mean = 50, sd = 50))
# (b)
cor(score,record, method = "kendall")
# out: -0.02283155, since the test gives us a value close to zero, we can say
# we can say that correlation doesn't exist.
hist(score)
lines(density(score, k = "triangular"), col = "blue")
# (c)
boxplot(score, 
        record,
        at = c(1,2), 
        names = c("score","record"),
        col = c("orange", "blue"), 
        horizontal = TRUE)
pairs(~score + record)

# 4.
# (a)
student = read.table(file.choose())
student = as.numeric(student)
# (b)
summary(student)
# (c)
barplot(student, horiz = T)
box()
#(d)
order(student)
rank(student)
# (e)
pie(student)

# 6.
women
class(women)
#a
barplot (as.matrix(women),beside = T)
#b 
attach(women)
pie(height,col=colors()[15:29])
detach(women)
#c
attach(women)
plot(height,weight)
detach(women)
#d
attach(women)
plot(height,weight)
abline(lm(weight~height))
detach(women)
#e
attach(women)
cor(height,weight) #Yes, it's the best fit
detach(women)