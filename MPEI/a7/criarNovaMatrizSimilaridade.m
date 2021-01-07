function [J] = criarNovaMatrizSimilaridade(u, users)
  
  Nu= length(users); % Número de utilizadores

  % Constrói a lista de filmes para cada utilizador

  Set= cell(Nu,1); % Usa células

  for n = 1:Nu % Para cada utilizador
    % Obtém os filmes de cada um
    ind = find(u(:,1) == users(n));
    % E guarda num array. Usa células porque utilizador tem um número
    % diferente de filmes. Se fossem iguais podia ser um array
    Set{n} = [Set{n} u(ind,2)];
  endfor

  %% Calcula a distância de Jaccard entre todos os pares pela definição.

  J=zeros(Nu); % array para guardar distâncias

  h= waitbar(0,'Calculating');

  for n1=1:Nu
    waitbar(n1/Nu,h);
    for n2= n1+1:Nu
      a = length(intersect(Set{n1}, Set{n2}));
      J(n1,n2) = 1 -a/(length(Set{n1}) + length(Set{n2}) - a);
      %%
    endfor
  endfor
  delete (h)
endfunction
