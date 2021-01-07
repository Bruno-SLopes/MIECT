y = 1;
pDef = 1 - (power(y, 0)/factorial(0))*power(exp(1),-y);
fprintf('P(>=1) = %s\n', num2str(pDef))