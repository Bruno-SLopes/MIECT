%%a)

N = 1000;
prob_pec_def = rand(5, N) < 0.3;
for i = 0:5 
    pec_def = sum(prob_pec_def) == i;
    p(i+1) = sum(pec_def)/N;
    fprintf('P(%s) = %s\n', num2str(i), num2str(p(i+1)))
end
stem(0:5, p)
axis([-1 6 0 1])

%-----------------------------------------------------------------------------
%%b)
fprintf('\n')
pb = p(1) + p(2) + p(3);
fprintf('P(maximo duas pecas) = %s\n', num2str(pb))