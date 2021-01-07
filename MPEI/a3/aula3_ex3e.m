%i. A probabilidade de obter pelo menos 2 coroas;


probabilidade0 = pBin(4, 0, 0.5);
probabilidade1 = pBin(4, 1, 0.5);
probabilidade2 = pBin(4, 2, 0.5);
probabilidade3 = pBin(4, 3, 0.5);
probabilidade4 = pBin(4, 4, 0.5);


prob_pelomenos_2 = probabilidade2+probabilidade3+probabilidade4;
fprintf('P(>=2) = %s\n', num2str(prob_pelomenos_2))
%ii. A probabilidade de obter ate 1 coroa; ´
prob_max_1 = probabilidade0 + probabilidade1;
fprintf('P(<=1) = %s\n', num2str(prob_max_1))


%iii. A probabilidade de obter entre 1 e 3 coroas.
prob_entre_1_3 = probabilidade1+probabilidade2+probabilidade3;
fprintf('P(>=1 && <=3) = %s\n', num2str(prob_entre_1_3))