function ber = Bernoulli(p, N)
  ber = rand(1, N) <= p;
  ber = double(ber)
endfunction
