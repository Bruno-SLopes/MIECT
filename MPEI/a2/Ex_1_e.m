N = 1e6; %%número de experiencias

p = 0.5; %%probabilidade de ser rapaz

n = 5; %%familia de cinco filhos

nascimentos = rand(n,N) < p; 
peloMenosUmFilho = sum(nascimentos)>=1; % pelo menos 1 filho
doisFilhos = sum(nascimentos)==2; % exatamente 2 filhos
probSimulacao = sum(doisFilhos)/sum(peloMenosUmFilho)