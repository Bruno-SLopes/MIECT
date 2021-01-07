%paises.m
%M = {'a', 'b', 'c'} cell array
clear all

m = 10;
n = 8*m; % existe formula
k = fix(0.693 * n/m);
Membros = {'Portugal', 'Espanha', 'Franca'}     %lista de paises

B = initialize(n);

for i=1:length(Membros)
  B = insert(Membros{i}, B, k);
endfor
stem(B)


%% falsos negativos

fn = 0;
for i=1:length(Membros)
  r = isMember(Membros{i}, B, k);
  
  if r
    fn = fn + 1
  end
  
endfor

fn

%% falsos positivos
Teste = {'Inglaterra', 'POrtugal', 'Noruega', 'Suica'}
fp = 0;
for i=1:length(Teste)
  r = isMember(Teste{i}, B, k);
  
  if r
    fp = fp + 1
  end
  
endfor

fp