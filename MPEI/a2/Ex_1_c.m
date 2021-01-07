N = 1e6; %%número de experiencias

p = 0.5; %%probabilidade de ser rapaz

n = 2; %%familia de dois filhos

nascimentos = rand(n, N);
rapazes = nascimentos < p;
n_rapazes = sum(rapazes);
peloMenosUmFilho = sum(n_rapazes>=1);
doisFilhosRapazes = sum(n_rapazes==2);
probSim= sum(doisFilhosRapazes)/sum(peloMenosUmFilho)

%%nascimentos = rand(n,N) < p; 
%%peloMenosUmFilho = sum(nascimentos)>=1; % pelo menos 1 filho
%%doisFilhos = sum(nascimentos)==2; % exatamente 2 filhos
%%probSimulacao = sum(doisFilhos)/sum(peloMenosUmFilho)