# :beginner: Sistema Cardapio Digital

> [!NOTE]
>
> *O sistema ainda está em desenvolvimento!*



 ## Requisitos

* :computer: Ser capaz de cadastrar cardapio.
* :computer: Ser capaz de filtrar cardapio por menu predefinido (Almoço, Janta, Lanche).
* :computer: Ser capaz de consultar cardapio por código e nome.
* :computer: Ser capaz de listar todos os cardápios com paginação.
* :computer: Ser capaz de excluir o cardapio.


## :notebook:  Caso de Uso - Cardapio
<details>
<summary style="font-size:20px;"><b>Caso de Uso</b></summary>
<ul style="list-style:none;">
   <li>
      💾  Cadastrar Cardapio
      <ul style="list-style:none;">
         <li>Informar o nome, menu, descrição, preço e link da imagem e o sistema armazenar no banco de dados.</li>
      </ul>
   </li>
   <li>
     📋   Filtrar Cardapio
      <ul style="list-style:none;">
         <li>O sistema vai listar todos os cardápios com paginação de acordo com o menu informado..</li>
      </ul>
   </li>
   <li>
     🔍  Consultar Cardapio por nome ou código
      <ul style="list-style:none;">
         <li>
          O sistema deverá exibir o cardapio de acordo com o código ou nome passado.                         </li>
      </ul>
   </li>
    <li>
     📋  Listar Cardapio
      <ul style="list-style:none;">
         <li>
          O sistema deverá listar todos os cardápios com paginação.                      
         </li>
      </ul>
   </li>
   <li>
     🗑️  Excluir Cardapio
      <ul style="list-style:none;">
         <li>
          O sistema deverá excluir o cardapio de acordo com o código informado. 
         </li>
      </ul>
   </li>
</ul>
<br />
<h3>Mockup do Cardapio-Form<h3>
<img src="mockups/cardapio-form.png" />
</details>


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



## Tecnologias utilizadas

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

