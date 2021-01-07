NE = 1e6;           %% Numero de experiencias

X = rand(1, NE) * 10; %% aleatorios entre 0 e 10

vcud = sum(X > 7);   %% variavel aleatoria X continua e uniformemente distribuida(vcud) 

probX2 = vcud / NE;    %% calcular as probabilidades dividindo a soma dos casos favoraveis pelas experiencias

fprintf('P(X ser maior que 7) = %d\n', probX2); 