%% probabilidade de ˜X -> p_X(i)
%% i -> notas de 5, 50, 100

%         |0.9 , se i = 5
% p_X(i) =|0.09, se i = 50
%         |0.01, se i = 100
%         |0   , para todos os outros valores de x que não estes mencionados
%               em cim

stem([5, 50, 100], [0.9, 0.09, 0.01]);
axis([0, 100, 0, 1]);
grid on;
xlabel('X Value (xi)');
ylabel('P(X = xi)');
title('Função de Massa de Probabilidade (FMP)');