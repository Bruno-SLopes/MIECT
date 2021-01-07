function [y] = Chaining_HashTable(chave, codigos_Hash)
  %%Criar array com tamanho dos codigos da hash
  
  [N, M] = size(codigos_Hash);
  for i=1:M
    if(chave == codigos_Hash(i,1))
      codigos_Hash(i,2) = string2hash(chave, 11);
      break;
    endif
    elseif(codigos_Hash(i,1) == 0)
      codigos_Hash(i,1) = chave;
      codigos_Hash(i,2) = string2hash(chave, 11);
      break;
    endif
  endfor
  
  y = codigos_Hash;
  
endfunction
