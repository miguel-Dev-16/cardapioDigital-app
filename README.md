# :beginner: Sistema Cardapio Digital

 ## Requisitos
* :computer: Ser capaz de cadastrar cardapio.
* :computer: Ser capaz de filtrar cardapio por menu predefinido (Almoço, Janta, Lanche).
* :computer: Ser capaz de consultar cardapio por código e nome.
* :computer: Ser capaz de listar todos os cardápios com paginação.
* :computer: Ser capaz de excluir o cardapio.



## :notebook: Caso de Uso - Cardapio

### Cadastrar Produto
Informar o nome, menu, descrição, preço e link da imagem e o sistema armazenar no banco de dados.
### Filtrar Cardapio
O sistema vai listar todos os cardápios com paginação de acordo com o menu informado. 
## Consultar Cardapio por nome e código
O sistema deverá exibir o cardapio de acordo com o código ou nome passado.
## Listar Cardapio
O sistema deverá listar todos os cardápios com paginação.
## Excluir Cardapio
O sistema deverá excluir o cardapio de acordo com o código informado.
## Mockup do Cardapio-Form



![mockup](mockups/cardapio-form.png)

## Modelo de dados
**tbl_cardapio:**

| Nome do campo | Tipo de dados | Tamanho | Campo obrigatório | Unicidade | Editável |
| :-----------: | :-----------: | :-----: | :---------------: | :-------: | :------: |
|    código     |   PK (Long)   |    -    |        SIM        |    SIM    |    -     |
|     menu      |     ENUM      |    -    |        SIM        |     -     |    -     |
|     preço     |    DOUBLE     |    -    |        SIM        |     -     |   SIM    |
|    imagem     |    VARCHAR    |    -    |        SIM        |     -     |   SIM    |
|     nome      |    VARCHAR    |    -    |        SIM        |    SIM    |   SIM    |
|   descrição   |     TEXT      |    -    |        SIM        |     -     |   SIM 



## Tecnologias

   <img align="left" 
      alt="java"
      width="90px"
      height="30px"
      style="padding-right: 10px;" 
      src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white" /><img align="left" 
       alt="java"
       width="90px"
       height="30px"
      style="padding-right: 10px;" 
       src="https://img.shields.io/badge/mysql-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white" /><img align="left" 
      alt="java"
      width="90px"
      height="30px"
      style="padding-right: 10px;" 
      src="https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white" /><img align="left" 
      alt="java"
      width="90px"
      height="30px"
      style="padding-right: 10px;" 
      src="https://img.shields.io/badge/Eclipse-FE7A16.svg?style=for-the-badge&logo=Eclipse&logoColor=white" />

