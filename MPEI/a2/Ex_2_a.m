N = 1e6;

NL = 10;

p = 0.5;

k = 10;

experiencias = rand(NL,N) > p;
sucessos= sum(experiencias)==k;
probSimulacao= sum(sucessos)/N
