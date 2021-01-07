%%Ex1
close;
clear all;
clc;

T = [0.7 0.8; 0.3 0.2];

%% (a)
I_0 = [1; 0];
next_week_probabilities = T^2 * I_0;

fprintf('(a) Probability of being present: %f\n', next_week_probabilities(1))

%% (b)
I_0 = [0; 1];
next_week_probabilities = T^2 * I_0;

fprintf('(b) Probability of being present: %f\n', next_week_probabilities(1))

%% (c)
I_0 = [1; 0];
last_week_probabilities = T^29 * I_0;

fprintf('(c) Probability of being present: %f\n', last_week_probabilities(1))

%% (d)
I_0 = [0.85; 0.15];
prob_not_present = zeros(30,1);

for i=1:30
    ith_week_probabilities = T^(i-1) * I_0;
    prob_not_present(i) = ith_week_probabilities(2);
    fprintf('(d) Probability of not being present in %d classes: %f\n', i, ith_week_probabilities(2))
endfor

figure; 
hold on;
p2 = plot(prob_not_present);
legend([p2], ["Probability of not being present"])
grid on
axis([0 30 0 1])
xlabel('Number of classes')
ylabel('Probability of not going to class')
title('Evolution of going or not to class')