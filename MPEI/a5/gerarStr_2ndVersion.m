function[y] = gerarStr_2ndVersion(media, variance, alphabet, pmfPTAcumulada)
  
  length = sqrt(variance) * (floor(randn()) + media);
  
  y = '';
  
  for i=1:length
    letterIndex = find(pmfPTAcumulada > rand());
    y(i) = alphabet(letterIndex(1));
  endfor
  
endfunction