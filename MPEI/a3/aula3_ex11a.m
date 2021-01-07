NE = 1e6;

a = 14 + 2*randn(1, NE);

vcdn = (a>12 & a<16); %% variavel aleatoria X continua e com distribuicao normal

pNota = sum(vcdn)/NE;

fprintf('P(Nota entre 12 e 16) = %s\n', num2str(pNota))