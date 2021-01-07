%%Ex3 (a)

clear;
clc;

pt_alphabet = ['A':'Z', 'a':'z', '0':'9'];

files = {'pg21209.txt','pg26017.txt'};
pmfPT = pmfLetrasPT(files, pt_alphabet);
distLettersPT = cumsum(pmfPT);

n = 8000;
k = 3;
B = zeros(1, n, 'uint8');

string_num = 1000;
string_length = 40;

for i=1:string_num
  str = gerarRandomPTString(string_length, pt_alphabet, distLettersPT);
  B = insert(str, B, k);
endfor

count = 0;

for i=1:string_num
  str = gerarRandomPTString(string_length, pt_alphabet, distLettersPT);
  if (isMember(str, B, k) == 1)
    count = count + 1;
  endif
endfor
fprintf("\n%d pertencem.\n", count);

test_num = 10000;

false_positives = 0;
for i=1:test_num
    
    test_str = gerarRandomPTString(string_length, pt_alphabet, distLettersPT);
    
    if isMember(test_str, B, k) == 1
        fprintf("O ");
        false_positives = false_positives + 1;
    else
        fprintf("X ");
    end
    if rem(i, 50) == 0
        fprintf("\n");
    end
endfor

fprintf("\nPercentage of false positives: %4.3f%%\n", (false_positives/test_num)*100);