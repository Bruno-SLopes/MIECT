function [palavras_Fich] = ler_Fich(nome_fich)
  printf('A ler ficheiro %s...\n', nome_fich);
  fich = fopen(nome_fich);
  fich_palavras = fscanf(fich, '%c', inf);
  palavras_Fich = strsplit(fich_palavras);
endfunction
