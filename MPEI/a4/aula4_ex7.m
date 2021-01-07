%% Ex 7

for i=1:3
  subplot(3, 2, i)
  hist(sqrt(2)*BoxMuller(30)+14)
  title('Box-Muller')
  axis([10 20 0 15])
  subplot(3, 2, i + 3)
  hist(randn(1, 30)*sqrt(2)+14)
  title('Randn')
  axis([10 20 0 15])
endfor
