function str = gerarStr(minLength, maxLength, alphabet)

  length = floor(rand()*(maxLength-2)) + minLength;
  str = '';
  for i=1:length
    str(i) = alphabet(ceil(rand()*52));
  endfor
  
endfunction