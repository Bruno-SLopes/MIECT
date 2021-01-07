function myhist(v)
  [n,x]=hist(v,min(v):max(v));
  N=length(v);
  stem(x,n/N);
  axis([min(x)-0.5 max(x)+.5 0 1]);

endfunction
