N = 1e6; %%número de experiências

p = 0.5; %%probabilidade de nascer rapaz

k = 1; %%número de filhos rapaz

n = 2; %%número de filhos

experiencias = rand(n,N) > p;
sucessos= sum(experiencias)>=k;
probSimulacao= sum(sucessos)/N
