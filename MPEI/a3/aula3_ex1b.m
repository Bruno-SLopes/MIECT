xi = [1,2,3,4,5,6];

pxi=zeros(1,6)
prob = 0;
for u=1:6
  if(u ==1)
    pxi(1,u)=1/6;
  else
    pxi(1,u) = pxi(1,u-1) + 1/6;
  endif
  prob = prob + pxi(1,u);
endfor
pxi

stairs(xi,pxi);
xlabel('x');
ylabel('px(x)');

