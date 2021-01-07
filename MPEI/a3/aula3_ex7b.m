y = 15;
p = [];
for i = 1:10
    p(i) = (power(y, i)/factorial(i))*power(exp(1),-y);
end
fprintf('P(>10 em 1 seg) = %s\n', num2str(1-sum(p)))