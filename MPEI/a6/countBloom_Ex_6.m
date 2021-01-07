function [ value ] = countBloom_Ex_6 (elem, B, k)
    m = length(B);
    
    values = zeros(1, k);
    elemToHash=elem;
    
    for j= 1: k
        elemToHash = [elemToHash num2str(j)];               
        h = rem (string2hash(elemToHash), m);
        h = h + 1;
        values(j) = B(h);
    endfor
 
    value = min(values);
endfunction
