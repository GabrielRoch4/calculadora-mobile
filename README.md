# Calculadora Android
Este é um projeto de uma calculadora simples desenvolvida para dispositivos Android, utilizando Kotlin para a lógica da aplicação e XML para o layout. A calculadora permite realizar operações matemáticas básicas, como adição, subtração, multiplicação e divisão, e possui uma interface amigável e intuitiva.

## Layout
O layout da calculadora é implementado utilizando um GridLayout, que organiza os botões em uma grade de 5 linhas e 4 colunas. A parte superior da tela apresenta um campo de exibição, implementado com um TextView, que exibe os números inseridos e o resultado das operações.

### Estrutura do Layout
Tela de Exibição: Um TextView centralizado que exibe os valores e resultados, com um fundo escuro e texto em branco, proporcionando uma boa visibilidade.

#### Botões:

Limpar (C): Um botão para limpar a tela.
Operações Matemáticas: Botões para as operações de adição (+), subtração (-), multiplicação (*), e divisão (/), todos com um design arredondado.
Números: Botões para os dígitos de 0 a 9, organizados em uma grade.
Igual (=): Um botão para calcular o resultado da operação em curso.
Ponto (.): Um botão para inserir valores decimais.
Todos os botões possuem um design personalizado, utilizando arquivos de drawable para adicionar cantos arredondados e cores agradáveis, com textos em branco para melhor contraste.

## Funcionalidades
Realização de operações básicas de cálculo.
Capacidade de limpar a tela e reiniciar a entrada com o botão "C".
Exibição dos resultados na tela de forma clara.
Tratamento de erros, como divisão por zero, evitando falhas na aplicação.
Validações que impedem a inserção de operadores consecutivos, garantindo entradas válidas.

## Tecnologias Utilizadas
Kotlin: Para a lógica da aplicação.
XML: Para o layout da interface do usuário.
