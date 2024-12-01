Erros encontrados: 
1- As informações de login e senha estão descritas diretamente no código, o que causa perda de segurança no código
2- O fato de não ser fechada a conexão faz com que haja a possibilidade de deixar o sistema lento
3- Falta de segurança na consulta relacionada ao SQL Injection, pois ao interigar diretamente os dados de login e senha é possível acessar informações importantes a partir destas funções
4- Em caso de erros, nada é retorno, podendo deixar confuso a experiência do usuário
---------------------------------------------------------
Critérios de Caixa Branca - ETAPA 3
Total de 18 Nodos e 18 Arestas
Cálculo de Complexidade Ciclomática - CC = E - N + 2 ->> CC = 18 - 18 + 2 = 2
O Cálculo de Complexidade Ciclomática é 2
