%%Ex 8

dist = (sqrt(2)*BoxMuller(30)+14)
subplot(1,2,1)
hist(dist)
title('Sem rejeicao')
dist(dist<9 | dist>19) = []
subplot(1,2,2)
hist(dist)
title('Com rejeicao')