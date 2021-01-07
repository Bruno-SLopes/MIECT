function [similar] = areSimilar(n1, n2, matrizSimilaridade, threshold)
  similar = (matrizSimilaridade(n1, n2) < threshold);
endfunction
