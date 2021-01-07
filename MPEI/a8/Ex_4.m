%%Ex4
close;
clear all;
clc;

%% (a)

p = 0.4;
q = 0.6;
T = [   p.^2, 0, 0, q.^2;       ...
    (1-p).^2, 0, 0, q.*(1-q);   ...
    p.*(1-p), 0, 0, q.*(1-q);   ...
    p.*(1-p), 1, 1, (1-q).^2];
    
%% (b)

I_0 = [1; 0; 0; 0];

after_10_trans = T^10 * I_0;

fprintf('Probability of being in state A after 10 transitions: %f\n', after_10_trans(1))
fprintf('Probability of being in state B after 10 transitions: %f\n', after_10_trans(2))
fprintf('Probability of being in state C after 10 transitions: %f\n', after_10_trans(3))
fprintf('Probability of being in state D after 10 transitions: %f\n', after_10_trans(4))