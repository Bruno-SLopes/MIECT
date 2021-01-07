function [ y ] = minHashingToDist(t)
    % Calcula distância baseada no minHash
    y = zeros(length(t(1,:)),length(t(1,:)));
    for i = 1:length(t(1,:))
        for j = i + 1:length(t(1,:))
            y(i,j) = sum(t(:,i)==t(:,j))/length(t(:,1));    
        end
    end
end