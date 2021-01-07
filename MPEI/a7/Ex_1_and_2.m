%%Ex_1_and_2
% C�digo base para gui�ao PL07 MPEI 2018-2019
clear all;
clc;
close;
tic
udata=load('u.data'); % Carrega o ficheiro dos dados dos filmes

% Fica apenas com as duas primeiras colunas

u= udata(1:end,1:2); clear udata;

% Lista de utilizadores

users = unique(u(:,1)); % Extrai os IDs dos utilizadores
Nu= length(users); % N�mero de utilizadores

% Constr�i a lista de filmes para cada utilizador

if exist('Jmatrix.mat', 'file')
  %Se existir
  load Jmatrix
else
  %Se n�o existir
  printf('Criar nova matriz de similaridade...\n');
  
  J = criarNovaMatrizSimilaridade(u, users);
  save Jmatrix J
  imagesc(J)
end


%% Com base na dist�ncia, determina pares com
%% dist�ncia inferior a um limiar pr�-definido
printf('Searching for similar pairs...\n');
threshold =0.4; % limiar de decis��o

% Array para guardar pares similares (user1, user2, dist�ncia)

SimilarUsers= zeros(1,3);
k= 1;
for n1= 1:Nu
  for n2= n1+1:Nu
    if areSimilar(n1, n2, J, threshold)
      SimilarUsers(k,:)= [users(n1) users(n2) J(n1,n2)]
      k= k+1;
    endif
  endfor
endfor

SimilarUsers
printf('---%d similar users\n', k-1);
disp(SimilarUsers)
toc