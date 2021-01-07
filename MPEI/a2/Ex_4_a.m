darts = 20; %% lançamento com os olhos vendados de 20 dardos
targets = 100; %% , um de cada vez, para 100 alvos
%% garantindo-se que cada dardo atinge sempre um alvo (e apenas 1)
N = 1e6; %% numero de experiencias

simulation = floor(rand(20, N)*targets)+1;
hitOneMoreThanOnce = 0;
for i=1:N
  hitOneMoreThanOnce = hitOneMoreThanOnce + (length(unique(simulation(:,i))) ~= darts);
endfor

prob = probHitAtMostOnce - hitOneMoreThanOnce/N

%%a = rand(20, 10000);
%%b = ceil(a*100);
%%cont = 0;
%%for k = 1:10000
%%    if length(unique(b(:,k))) == 20
%%        cont = cont + 1;
%%    end
%%end
%%p = cont/10000;
%%fprintf('Probabilidade = %s\n', num2str(p));
