% fator de carga = chaves / tamanho do array

fc = 0.8;
n = 1000;  % numero de strings (numero de chaves)
m = 1000/fc;  % tamanho do array 
array = zeros(1,m);

for i = 1:n
  string = gerarStr();
  hash = string2hash(string);
  pos = rem(hash, m) + 1;
  array(pos) = array(pos) + 1;
  
  subplot(1, 2, 1)
  stem(array);
  
  subplot(1, 2, 2)
  hist(array, 0:5);
  
  drawnow
endfor
  
%%Um dos testes feitos na aula para o teste de funções