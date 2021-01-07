NE = 1e6;

a = 14 + 2*randn(1, NE);

vcdn = (a>10 & a<18); %% variavel aleatoria X continua e com distribuicao normal

pNota = sum(vcdn)/NE;

fprintf('P(Nota entre 10 e 18) = %s\n', num2str(pNota))