NE = 1e6;             %% Numero de experiencias

X = rand(1, NE) * 10; %% aleatorios entre 0 e 10

vcud = sum(X > 1 & X < 6); %% variavel aleatoria X continua e uniformemente distribuida(vcud) 

probX3 = vcud / NE; %% calcular as probabilidades dividindo a soma dos casos favoraveis pelas experiencias

fprintf('P(X estar entre 1 e 6) = %d\n', probX3); 