%%Ex2
close;
clear all;
clc;

%% (a)

T = [ 1/3    .25    0;   ...
      1/3    .55    1/2; ...
      1/3    .20    1/2];
  
% Confirm it's a stochastic matrix
stochastic = sum(sum(T)) - size(T,1);
fprintf("\nIs T stochastic? %d\n\n", stochastic == 0);

%% (b)
I_0 = [2/3; 1/6; 1/6];

%% (c)

final_distribution = T^30 * I_0;

fprintf('(c) Number of students in group A: %d\n', round(90*final_distribution(1)))
fprintf('(c) Number of students in group B: %d\n', round(90*final_distribution(2)))
fprintf('(c) Number of students in group C: %d\n\n', round(90*final_distribution(3)))

%% (d)

I_0 = [1/3; 1/3; 1/3];

final_distribution = T^30 * I_0;

fprintf('(d) Number of students in group A: %d\n', round(90*final_distribution(1)))
fprintf('(d) Number of students in group B: %d\n', round(90*final_distribution(2)))
fprintf('(d) Number of students in group C: %d\n', round(90*final_distribution(3)))