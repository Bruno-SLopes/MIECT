function [probSimulacao] = calcp (p, k, n, N)

%%fazer experiencias N vezes
lancamentos = rand(n,N) > p;

%%contar sucessos = caras e ver igualdade a k
sucessos= sum(lancamentos)==k;


probSimulacao= sum(sucessos)/N;
endfunction
