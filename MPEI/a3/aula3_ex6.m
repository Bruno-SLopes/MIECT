p = 0,001 %% probabilidade defeito
k = 7;    %% haver 7 pecas com defeito
n = 8000; %% numero de pecas, 8000

%% Lei de Poisson
pPoi = ((n*p)^k / factorial(k))*exp(-(n*p));
fprintf('Probabilidade de 7 pecas terem defeito: %d\n', pPoi)

%%Binomial
probBin = prod(n-k+1:n)/prod(1:k) * p^k * (1-p)^(n-k);
fprintf('Probabilidade de 7 pecas terem defeito: %d\n', probBin)