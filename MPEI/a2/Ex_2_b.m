N = 1e6;

p = 0.5;

NL = 11;

lancamentos = rand(NL,N) < p; 
firstTenThrows = lancamentos(1:10,:);
numTenHeads = sum(firstTenThrows)==10; % 10 heads in first 10 throws
numElevenHeads = sum(lancamentos)==11; % 11 heads total
prob = sum(numElevenHeads)/sum(numTenHeads)