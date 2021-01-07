%%Ex3
close;
clear all;
clc;

%% (a)

T = rand(20, 20);
% normalize T's columns (T must be a stochastic matrix)
for i=1:20
    T(:, i) = T(:, i) / sum(T(:, i));
end

I_0 = zeros(20,1);
I_0(1) = 1;

% 20 transitions
after_20_trans = T^20 * I_0;
fprintf('Probability of transitioning between the first and last state in 20 transitions: %f\n', after_20_trans(20))
% 40 transitions
after_40_trans = T^40 * I_0;
fprintf('Probability of transitioning between the first and last state in 20 transitions: %f\n', after_40_trans(20))
% 100 transitions
after_100_trans = T^100 * I_0;
fprintf('Probability of transitioning between the first and last state in 20 transitions: %f\n', after_100_trans(20))