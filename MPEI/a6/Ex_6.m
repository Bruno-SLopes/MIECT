% Ex. 6

clc;
clear;
close all;

% Open file
%%nome_Fich = '58281-0_smaller.txt';
nome_Fich = '58281-0.txt';
palavras_Fich = ler_Fich(nome_Fich);

% Adicionar palavras ao Bloom Filter
n =  length(palavras_Fich);                         %  numero de palavras
m = n * 15;                                         %  tamanho do Bloom Filter
k = round ((m / n) * log(2));                       %  Valor otimo de k
B = initialize (m);

printf('\nCriar Bloom Filter para palavras no ficheiro %s...\n', nome_Fich);
bar = waitbar(0,'Criar Bloom Filter para palavras...');            % wait bar
for i = 1: n
    B = insert_Ex_6(palavras_Fich{i}, B, k);
    valueBar =  i / n;
    waitbar(valueBar, bar, sprintf('\nCreating Bloom Filter for words in file %s...\n%.2f%% done.', nome_Fich, valueBar * 100))
endfor
waitbar(1, bar, sprintf('\nDone!'))
delete(bar)

printf('Numero de ocorrencias das palavras: \n')
palavras_Fich = sort(unique(palavras_Fich));     % remover palavras repetidas
n = length(palavras_Fich);
values = zeros(1, n);

for i = 1: n
    palavra = palavras_Fich{i};
    values(i) = countBloom_Ex_6(palavra, B, k);
    printf('\t%s -> %d\n', palavra, values(i))
endfor

[maxValue, maxIndex] = max(values);
printf('\n------------------------\nMost frequent word: %s (%d times)\n', palavras_Fich{maxIndex}, maxValue)