N = 1e6; %%número de experiencias

p = 0.5; %%probabilidade de ser rapaz

n = 2; %%familia de dois filhos

nascimentos = rand(n, N) < p;
peloMenosUmFilho = nascimentos(1,:)==1; % sabendo que o primeiro filho e rapaz
doisFilhosRapazes = sum(nascimentos)==2; % ter exatamente dois filhos
probSim = sum(doisFilhosRapazes)/sum(peloMenosUmFilho)