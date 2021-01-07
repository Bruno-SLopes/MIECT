%%Ex5

palavras_Fich_1 = ler_Fich('58281-0.txt');
palavras_Fich_2 = ler_Fich('58285-0.txt');

n = length(palavras_Fich_1);     %numero de palavras
m = n * 15;                      %tamanho do Bloom Filter
k = round((m/n) * log(2));       %valor otimo para k
B = initialize(m);

printf('\nA criar Bloom Filter para as palavras no ficheiro 58285-0.txt...\n');
for i=1:length(palavras_Fich_1)
  B = insert(palavras_Fich_1{i}, B, k);
endfor

printf('Verificar se as palavras no ficheiro 58285-0.txt pertencem ao 58281-0.txt...\n');
count = 0;
for i=1:length(palavras_Fich_2)
  cont_palavras = isMember(palavras_Fich_2{i}, B, k);   %cont_palavras -> conter palavras
  if(cont_palavras ~= 1)
    count = count + 1;
  endif
  
endfor

printf('Numero de palavras do segundo texto que nao existem no primeiro: %d\n', count);
