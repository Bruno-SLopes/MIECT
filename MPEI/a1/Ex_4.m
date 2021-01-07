%%todo o espac¸o de amostragem quando o numero de lanc¸amentos ´ e 20, 40 e 100

N = 1e6;

NL = 20; % num de lancamentos
pCara = 0.5;


p = zeros(1, NL+1); %% criar array de prob
tic
for k=0:NL % para todo o espaco de amostragem
  
  p(k+1) = calcp(pCara, k, NL, N);
  
  fprintf(1,'P[%d caras em %d lancamentos]=%4f\n', k, NL, p(k+1));
endfor

stem(0:NL, p);
toc