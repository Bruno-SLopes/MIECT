function [y] = HashTable_2ndVersion(N, a, pmfPTAcumulada, alpha)
  table = zeros(1, N);
  
  for i=1:N
    chave = gerarStr_2ndVersion(10, 5, alpha, pmfPTAcumulada);
    a = mod(string2hash(chave), N)+1;
    table(1, a) += 1;
  endfor
  
  y = table;
endfunction
