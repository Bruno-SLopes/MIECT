N = 1e6;
lancamentos = randi([1,5], 2, N);

%%A
kA = sum(sum(lancamentos) == 10);
pA = kA/N;

%%B
kB = sum(sum(lancamentos==5)>=1);

pB = kB/N;

%%A e B

cA = sum(lancamentos) == 10;
cB = sum(lancamentos==5)>=1;

cAB = cA & cB; %%equiv cA*cB

pAB = sum(cAB)/N