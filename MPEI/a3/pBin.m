function p = pBin(n, k, p)
  p = factorial(n)/(factorial(n-k) * factorial(k)) * p^k * (1-p)^(n-k);
endfunction
