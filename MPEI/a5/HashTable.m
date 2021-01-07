function [y] = HashTable(N, a)
  table = zeros(1, N);
  
  for i=1:N
    chave = gerarStr();
    a = mod(string2hash(chave), N)+1;
    table(1, a) += 1;
  endfor
  y = table;
endfunction
