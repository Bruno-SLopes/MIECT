%%Ex1
function B = insert(elem, B, k)
  % insere elem no Bloom Filter B, k hash functions
  n = length(B);
  
  key = elem;
  for hf=1:k
    
    % aplicar hash function
    %pos = hashFunction(hf, elem);
    key = [key num2str(hf)];
    pos = string2hash(key);
    pos = rem(pos, n);
    pos = pos + 1;
    fprintf(1, ' %s -> %s : hf=%d, pos = %d\n', elem, key, hf, pos);
    
    % set pos
    B(pos) = 1;
  endfor
endfunction
