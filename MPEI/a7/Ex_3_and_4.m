%% Ex_3_and_4 
clear all;
clc;
close;
tic
udata=load('u.data');  % Carrega o ficheiro dos dados dos filmes
% Fica apenas com as duas primeiras colunas
u= udata(1:end,1:2);

[tusers, Set, totMovies] = filmes(udata);

if exist('Jmatrix.mat', 'file')
  %Se existir
  load Jmatrix
else
  %Se n�o existir
  printf('Criar nova matriz de similaridade...\n');
  
  J = criarNovaMatrizSimilaridade(u, tusers);
  save Jmatrix J
  imagesc(J)
end

% Calcula tabela com minHashes
t = minHashing(tusers, totMovies, Set);

% Calcula diferença de colunas com base no minHash
t = minHashingToDist(t);
t = 1 - t;
printf('Searching for similar pairs and distances...\n');
threshold = 0.4;
k = 1;
for i = 1:length(t)
    for j = i + 1:length(t)
        if (t(i,j) < threshold)
            fprintf('id1: %d id2: %d distância: %f \n',tusers(i),tusers(j),t(i,j));
            k = k + 1;
        end
    end
end
SimilarUsers = getSimilar(J, tusers, threshold);
SimilarUsers
printf('---%d similar users\n', k-1);
disp(SimilarUsers)
toc