function [str] = gerarRandomPTString(str_length, pt_alphabet, distLettersPT)

    
    str = '';
    for i=1:str_length
        letterIndex = find(distLettersPT > rand());
        str(i) = pt_alphabet(letterIndex(1));
    endfor

endfunction