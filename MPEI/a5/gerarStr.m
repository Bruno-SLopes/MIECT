function [ y ] = gerarStr()
  %length = ceil(rand()*18 + 2);
  length = randi([3,20]);
  alphabet = ['a':'z' 'A':'Z'];
  %y = '';
  for i = 1:length
    index = ceil(rand() * 52);
    y(i) = alphabet(index);
  endfor
endfunction