%%Ex6
close;
clear all;
clc;

%% (a)

H = [ 0.8    0.0    0.3    0.0; ...
      0.2    0.9    0.2    0.0; ...
      0.0    0.1    0.4    0.0; ...
      0.0    0.0    0.1    1.0];
      
%% (b)

prob_1000_trans = H^1000 * [1; 0; 0; 0];

fprintf('(b) Probability of being in page 2 after 1000 transitions: %f\n', prob_1000_trans(2));

%% (c)

prob_1_trans = zeros(4, 4);
prob_2_trans = zeros(4, 4);
prob_100_trans = zeros(4, 4);

for i=1:4
    
    I_0 = [1;2;3;4] == i;
    
    aux = H^1 * I_0;
    prob_1_trans(:,i) = aux(:);
    
    aux = H^2 * I_0;
    prob_2_trans(:,i) = aux(:);
    
    aux = H^100 * I_0;
    prob_100_trans(:,i) = aux(:);
endfor

for i=1:4
    fprintf('Starting from state %d\n', i)
    for j=1:4
        fprintf('\tProbability of being in state %d after  1  transition:  %f\n', j, prob_1_trans(j,i))
        fprintf('\tProbability of being in state %d after  2  transitions: %f\n', j, prob_2_trans(j,i))
        fprintf('\tProbability of being in state %d after 100 transitions: %f\n\n', j, prob_100_trans(j,i))
    endfor
endfor

%% (d)
Q = H(1:3,1:3);

%% (e)
n = size(Q, 1);
F = inv(eye(n) - Q);

%% (f)
meanOfIterations = sum(F);

fprintf('(f) Average transitions to reach state 4 after starting in state 1: %f transitions\n', meanOfIterations(1));
fprintf('(f) Average transitions to reach state 4 after starting in state 2: %f transitions\n', meanOfIterations(2));
fprintf('(f) Average transitions to reach state 4 after starting in state 3: %f transitions\n\n', meanOfIterations(3));

%% (g)

fprintf('(g) (Average) time for state 1 to be absorved (to reach state 4): %f (transitions)\n', meanOfIterations(1));
fprintf('(g) (Average) time for state 2 to be absorved (to reach state 4): %f (transitions)\n', meanOfIterations(2));
fprintf('(g) (Average) time for state 3 to be absorved (to reach state 4): %f (transitions)\n\n', meanOfIterations(3));

%% (h)

NewH = [ 0.8    0.1    0.5    0.0; ...
         0.2    0.8    0.25   0.0; ...
         0.0    0.1    0.2    0.0; ...
         0.0    0.0    0.05   1.0];
     
NewQ = NewH(1:3,1:3);
NewF = inv(eye(3) - NewQ);
meanOfIterations = sum(NewF);

fprintf('(h) New (average) time for state 1 to be absorved (to reach state 4): %f (transitions)\n', meanOfIterations(1));
fprintf('(h) New (average) time for state 2 to be absorved (to reach state 4): %f (transitions)\n', meanOfIterations(2));
fprintf('(h) New (average) time for state 3 to be absorved (to reach state 4): %f (transitions)\n\n', meanOfIterations(3));

%% (i)

% an example state transition matrix (page 3 is absorving)
H = [ 0.8    0.0    0.3    0.0; ...
      0.2    0.9    0.2    0.0; ...
      0.0    0.1    0.4    0.0; ...
      0.0    0.0    0.1    1.0];
  
% the fundamental matrix
transientStatesNum = 3;
Q = H(1:transientStatesNum, 1:transientStatesNum);
F = inv(eye(transientStatesNum)-Q);

% get experimental number of transitions - starting from state 1
averageTransState = zeros(3,1);
expIterations = 5000;

tic
for i=1:expIterations
    for j=1:transientStatesNum
        averageTransState(j) = averageTransState(j) + crawl_length(H, j, 4);
    end
end
toc

averageTransState = averageTransState / expIterations;

fprintf('(i) Experimental (average) time for state 1 to be absorved (to reach state 4): %f (transitions)\n', averageTransState(1));
fprintf('(i) Experimental (average) time for state 2 to be absorved (to reach state 4): %f (transitions)\n', averageTransState(2));
fprintf('(i) Experimental (average) time for state 3 to be absorved (to reach state 4): %f (transitions)\n', averageTransState(3));


%% (extra) if state 2 was absorvent, how likely would it be to end in state
% % 2 instead of state 4?

% H = [ 0.8    0.3    0.0    0.0; ...
%       0.0    0.4    0.0    0.0; ...
%       0.2    0.2    1.0    0.0; ...
%       0.0    0.1    0.0    1.0];
  
% H^100 * [0.5; 0.5; 0; 0]

% Q = H(1:2, 1:2);
% F = inv(eye(2) - Q);

% R = H(3:4, 1:2);
% R*F
