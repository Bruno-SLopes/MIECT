m = 10;
n = 8*m;
k = fix(0.693 * n/m);
B = initialize(n);
B = insert('a', B, k);

r = isMember('a', B, k);

if r
  fprintf(1,'%s é membro\n', 'a');
  
else
  disp('NAO MEMBRO!!!');
endif

%
r = isMember('b', B, k);

if r
  fprintf(1,'%s é membro\n', 'b');
  
else
  disp('NAO MEMBRO!!!');
endif