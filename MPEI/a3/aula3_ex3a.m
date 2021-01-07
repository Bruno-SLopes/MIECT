%%Estime, usando simulacao com o Matlab/octave, a funcao de probabilidade pX(x) da variavel
%aleatoria X.

numTent = 1000;
lanc_moeda = rand(4, numTent) > 0.5;
for i = 0:4
    n_coroa = sum(lanc_moeda) == i;
    p(i+1) = sum(n_coroa)/numTent;
    fprintf('P(%s) = %s\n', num2str(i), num2str(p(i+1)))
end
