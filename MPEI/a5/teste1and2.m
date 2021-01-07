% Teste

for i = 1:20 
  a = gerarStr();
  fprintf('%d) Random String: %s\n', i, a);
  fprintf('Random String Hash: %s\n', num2str(string2hash(a)));
  % ou então chamar a hashFunction passando a key(a) e o valor de n 
  fprintf('\n');
endfor
%%Outros testes feitos na aula para o teste de funções