%%Ex 5

xi=[1 2 3 4 5 6];
pX=[0.15,0.1,0.25,0.2,0.25,0.05];
n=10000;
hist(fmp(xi,pX,n),length(xi))