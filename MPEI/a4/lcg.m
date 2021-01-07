%%function lcg

function f = lcg(X0, a, c, m, N)
  f = zeros(N, 1);
  f(1) = rem(a * X0+c, m);
  for i=2:N
    f(i) = rem(a*f(i-1)+c, m);
  endfor
  f = f./m;
endfunction
