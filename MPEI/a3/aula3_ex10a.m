NE = 1e6;           %% Numero de experiencias

X = rand(1, NE) * 10; %% aleatorios entre 0 e 10

vcud = sum(X < 3);   %% variavel aleatoria X continua e uniformemente distribuida(vcud) 

probX1 = vcud / NE;    %% calcular as probabilidades dividindo a soma dos casos favoraveis pelas experiencias

fprintf('P(X menor que 3) = %d\n', probX1); 