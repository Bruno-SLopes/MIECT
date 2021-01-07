NE = 1e6;

a = 14 + 2*randn(1, NE);

vcdn = (a >= 10); %% variavel aleatoria X continua e com distribuicao normal

pNota = sum(vcdn)/NE;

fprintf('P(Nota maior ou igual a 10) = %s\n', num2str(pNota))