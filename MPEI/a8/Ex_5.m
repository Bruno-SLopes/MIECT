%%Ex5
close;
clear all;
clc;

%% (a)

%     sol   nuv   chuva
T = [ 0.7   0.2   0.3; ...
      0.2   0.3   0.3; ...
      0.1   0.5   0.4];
      
%% (b)
I_0 = [1; 0; 0];

day2_weather = T^2 * I_0;

fprintf('(b) Probability of rain on day 2: %f\n', day2_weather(3));

%% (c)
n = 20;
T_power = T;

value_evo = zeros(9, n);
value_evo(:,1) = T_power(:);

for i=2:n
    T_power = T_power * T;
    value_evo(:,i) = T_power(:);
endfor

figure;
plot(value_evo')

%% (d)

T_power = T;
prev_T = zeros(3,3);

value_evo = zeros(9, 1);
value_evo(:,1) = T_power(:);

threshold = 10^(-4);
value_evo(:,1) = T_power(:);

for i=2:n
    
    if (sum(sum(abs(T_power - prev_T))) <= threshold) 
        break;
    end
    
    prev_T = T_power;
    T_power = T_power * T;
    value_evo(:,i) = T_power(:);
end

figure;
plot(value_evo')


fprintf('(d) Number of iterations until diference is less than or equal to 10^(-4): %d\n', size(value_evo, 2));