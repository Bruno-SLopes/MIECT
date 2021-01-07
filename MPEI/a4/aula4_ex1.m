%% Ex 1
%%function y = lcg (X0, a, c, m, N).
%(a)
a = 7^5;
c = 137;
m = (2^31)-1;
N = 1e6;

numAleat = lcg(14, a, c, m, N);
figure;
subplot(1, 2, 1);
hist(numAleat);
fprintf('Numero de numeros unicos: %d\n', length(unique(numAleat)));

%(b)

numAleat = lcg(14, a, c, m, N);
subplot(1, 2, 2);
hist(numAleat);
fprintf('Numero de numeros unicos: %d\n', length(unique(numAleat)));
