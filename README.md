Erros encontrados: 
1- As informações de login e senha estão descritas diretamente no código, o que causa perda de segurança no código
2- O fato de não ser fechada a conexão faz com que haja a possibilidade de deixar o sistema lento
3- Falta de segurança na consulta relacionada ao SQL Injection, pois ao interigar diretamente os dados de login e senha é possível acessar informações importantes a partir destas funções
4- Em caso de erros, nada é retorno, podendo deixar confuso a experiência do usuário
-----------------------------------------------------
ETAPA 4
- O projeto visa implementar funcionalides de login e autenticação de usuários em um banco de dados feito em SQL
- O Objetivo trata-se de conectar o banco de dados, validando as informações fornecidas pelo usuário, visando retornar os resultados esperados
- Dentro do repositório é utilizada a classe user que estabelece a conexão do banco de dados e a verifação de usuários e utiliza dos métodos conectarBD() e verificarUsuario() no qual o primeiro conecta ao banco de dados MySQL utilizando seu driver e o segundo valida o login e a senah do usuário no MySQL
- A documentação foi gerada com o javadoc na pasta docs
