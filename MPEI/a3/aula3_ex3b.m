valor_esperado = 0;
for i = 1:5
   valor_esperado = valor_esperado + (i-1)*p(i);
end
fprintf('Valor esperado = %s\n', num2str(valor_esperado))
variancia = 0;
for i = 1:5
    variancia = variancia + power((i-1) - valor_esperado, 2)*p(i);
end
fprintf('Variancia = %s\n', num2str(variancia))
desvio_padrao = power(variancia, 1/2);
fprintf('Desvio padrao = %s\n', num2str(desvio_padrao))