%%Ex1
function [r] = isMember(elem, B, k)
  n = length(B);
  % verifica se elem pertence a B
  % devolve true or false
  r = true;
  key = elem;
  for hf=1:k
    
    % aplicar hash function
    %pos = hashFunction(hf, elem);
    key = [key num2str(hf)];
    pos = string2hash(key);
    pos = rem(pos, n);
    pos = pos + 1;
    fprintf(1, ' %s -> %s : hf=%d, pos = %d\n', elem, key, hf, pos);
    
    if B(pos) == 0 
      r = false;
      break;
    endif
    
  endfor
  
  
endfunction
