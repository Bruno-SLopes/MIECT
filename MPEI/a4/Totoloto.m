function [X] = Totoloto(Nbolas, Nsubconjunto)
  if Nsubconjunto > Nbolas
    Nsubconjunto = Nbolas;
  endif
  
  bol = zeros(1, Nbolas);
  
  for i=1:Nbolas
    bol(i) = i;
  endfor
  
  for i=1:Nsubconjunto
    indiceBolaRetirada = 1+floor(rand(1,1)*Nbolas);
    X(i) = bol(indiceBolaRetirada);
    bol(indiceBolaRetirada) = [];
    Nbolas = Nbolas - 1;
  endfor
endfunction
