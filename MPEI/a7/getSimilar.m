function [ SimilarUsers ] = getSimilar( J, random, threshold )
    % Array para guardar pares similares (user1, user2, distância)
    SimilarUsers= zeros(1,3);
    k= 1;
    len = length(J);
    for n1 = 1:len
        for n2 = n1 + 1:len
            if (J(n1, n2) <= threshold)
               SimilarUsers(k,:) = [random(n1) random(n2) J(n1,n2)];
               k= k+1;
            end
        endfor
    endfor
endfunction
