%%Ex_7

%%(a)

% Initial money the 3 friends has (Ana, Bernardo, Catarina)
initialMoney = [100; 200; 30];

% Money "flow" matrix between the 3 friends (Ana, Bernardo, Catarina)
T = [ 0.8   0.1   0.05; ...
      0.2   0.6   0.20; ...
      0.0   0.3   0.75];
  
moneyAfter3Trans = T^3 * initialMoney;

fprintf('(a) Ana''s       money after 3 transitions: $%4.2f\n', moneyAfter3Trans(1));
fprintf('(a) Bernardos''s money after 3 transitions: $%4.2f\n', moneyAfter3Trans(2));
fprintf('(a) Catarina''s  money after 3 transitions: $%4.2f\n\n', moneyAfter3Trans(3));


%% (b)
moneyAfter365Trans = T^365 * initialMoney;

fprintf('(b) Ana''s       money after 1 year (365 transitions): $%4.2f\n', moneyAfter365Trans(1));
fprintf('(b) Bernardos''s money after 1 year (365 transitions): $%4.2f\n', moneyAfter365Trans(2));
fprintf('(b) Catarina''s  money after 1 year (365 transitions): $%4.2f\n\n', moneyAfter365Trans(3));

%% (c)
n = 1;
moneyAfterNTrans = T * initialMoney;
while(1) 
    n = n + 1;
    moneyAfterNTrans = T * moneyAfterNTrans;
    
    if(moneyAfterNTrans(3) > 130)
        break;
    end
end
fprintf('(c) Catarina will have more than $130 after %d transitions.\n', n);
[month, day] = date_from_days(n+1);
fprintf('(c) That is, she will have $%4.2f on %s %dth.\n', moneyAfterNTrans(3), month, day);