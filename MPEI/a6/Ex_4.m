% Ex. 4

clear; clc; close all;

pt_alphabet = ['A':'Z', 'À', 'Á', 'Â', 'Ã', 'Ç', 'É', 'Ê', 'Í', 'Ó', 'Ô', ...
    'Õ', 'Ú', 'a':'z', 'à', 'á', 'â', 'ã', 'ç', 'é', 'ê', 'í', 'ó', 'ô', ...
    'õ', 'ú', '0':'9'];  

%  get portuguese letters alphabet distribution
files = {'pg21209.txt','pg26017.txt'};
pmfPT = pmfLetrasPT(files, pt_alphabet);
distLettersPT = cumsum(pmfPT);

% setup the bloom filter
n = 8000;

% initialize str_members
string_num = 1000;
string_length = 40;

% other variables
test_num = 10000;
theorical_false_pos = zeros(15, 1);
false_positives = zeros (15, 1);



for k = 1:15
      
    bar = waitbar(0, sprintf('Generating the bloom filter for k=%d...', k));            % wait bar
    
    % initialize the bloom filter
    B = zeros(1, n, 'uint8');
    
    % add every string to the filter
    for i=1:string_num   
        B = insert(gerarRandomPTString(string_length, pt_alphabet, distLettersPT), B, k);
    end
    
      % Show bloom filter's content
%     fprintf("|");
%     for j=1:bloom_size
%         fprintf("%d ", bloom_filter(1,j));
%     end
%     fprintf("|\n");
    
    % Get false positives
    theorical_false_pos(k, :) = (1 - exp(-k*string_num/test_num))^k;

    % test if added strings belong to the filter
    for i=1:test_num
        
        waitbar(i/test_num, bar);

        test_str = gerarRandomPTString(string_length, pt_alphabet, distLettersPT);
        
        if (isMember(test_str, B, k) == 1)
            false_positives(k, :) = false_positives(k, :) + 1;
        end
        if rem(i, 10) == 0
            fprintf(".");
            
            if rem(i, 1000) == 0
                fprintf("\n");
            end
        end
    end
    
    waitbar(1, bar, sprintf('\nDone!'));
    delete(bar);

end

figure(1);
stem(false_positives/test_num);
hold on;
stem(theorical_false_pos);
title('Simulated and Theorical probabilities of false positives');
xlabel("Number of hash functions");
ylabel("False positive probability");
grid on;
axis([-.5 15.5 0 1]);

fprintf("\nPercentage of false positives: %4.2f%%\n", (false_positives/test_num)*100);