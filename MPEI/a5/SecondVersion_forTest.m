%%Segunda versão para teste
clear;
clc;

%%Demonstração do resultado da string gerada pela pmf
%%acumulada, utilizando os ficheiros
alphabet = ['A':'Z' 'a':'z'];

ficheiros = {'pg21209.txt','pg26017.txt'};
pmfPT=pmfLetrasPT(ficheiros,alphabet);
[m,q] = size(pmfPT);
pmfPTAcumulada = zeros(m,q);
for s=1:q
  if (s == 1)
    pmfPTAcumulada(m,s) = pmfPT(m,s);
  else
    pmfPTAcumulada(m,s) = pmfPTAcumulada(m,s-1)+pmfPT(m,s);
  endif
endfor

printf("String -> %s\n", gerarStr_2ndVersion(10, 5, alphabet, pmfPTAcumulada))

%%Observação dos gráficos e histogramas relativos a essa
%%função e da media e variancia respetivas

N = 1000;
y = HashTable_2ndVersion(N, 0.8, pmfPTAcumulada, alphabet);
subplot(1,2,1)
hist(y, [0,1,2,3,4,5,6,7,8])

subplot(1,2,2)
bar(1:N, y)
ylim([0 10])
xlim([0 N])

prob0 = 0;
prob1 = 0;
prob2 = 0;
prob3 = 0;
prob4 = 0;
prob5 = 0;
prob6 = 0;
prob7 = 0;

for s=1:N
  if(y(1,s)==0)
    prob0 += 1;
  endif
  if(y(1,s)==1)
    prob1 += 1;
  endif
  if(y(1,s)==2)
    prob2 += 1;
  endif
  if(y(1,s)==3)
    prob3 += 1;
  endif
  if(y(1,s)==4)
    prob4 += 1;
  endif
  if(y(1,s)==5)
    prob5 += 1;
  endif
  if(y(1,s)==6)
    prob6 += 1;
  endif
  if(y(1,s)==7)
    prob7 += 1;
  endif
endfor

m = (0*prob0)/N + (1*prob1)/N + (2*prob2)/N + (3*prob3)/N + (4*prob4)/N + (5*prob5)/N + (6*prob6)/N + (7*prob7)/N;

varian = ((1^2)*prob1)/N + ((2^2)*prob2)/N + ((3^2)*prob3)/N + ((4^2)*prob4)/N + ((5^2)*prob5)/N + ((6^2)*prob6)/N + ((7^2)*prob7)/N;

printf("Media -> %i\n", m)
printf("Variancia -> %i\n", varian)
