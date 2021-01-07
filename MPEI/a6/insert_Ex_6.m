function [ B ] = insert_Ex_6 (elem, B, k)
    m = length(B);   
    elemToHash = elem;
    
    for i = 1: k
        elemToHash = [elemToHash num2str(i)];           
        h = rem (string2hash(elemToHash), m) + 1;       % hash value between 1 and m
        B(h) = B(h) + 1;                                                        % counts
    end
end