# CatFilmes

**Desenvolvido por Ninjaagoo**

CatFilmes é um programa de console feito em **Java** para organizar um pequeno catálogo de filmes. Ele permite cadastrar filmes, consultar a lista e pesquisar os registros salvos. O projeto usa um arquivo de texto para guardar os dados, sem precisar de banco de dados.

## O que o programa faz

- **Cadastrar filmes:** registra nome, categoria, ator, ano de lançamento, sinopse, classificação indicativa e informações de aluguel.
- **Listar filmes:** mostra cada filme em um bloco separado e informa o total cadastrado.
- **Pesquisar filmes:** procura um texto nos registros salvos. Você pode buscar, por exemplo, pelo nome ou pela categoria.
- **Ajuda:** explica as opções do menu.

Os filmes ficam em `filmes.txt`, na pasta de onde o programa é executado. O arquivo é criado automaticamente no primeiro cadastro; os próximos filmes são adicionados ao final dele. Até lá, a listagem estará vazia.

## Como executar

Instale um **JDK** e confirme que os comandos `javac` e `java` funcionam no terminal. Abra o terminal na pasta do projeto e execute:

```powershell
javac -encoding UTF-8 CatFilmes.java Menu.java FuncoesFilmes.java BuscaFilmes.java LimparConsole.java Entrada.java
java CatFilmes
```

No menu, digite o número da opção desejada. Use **0** para sair.

> A função de limpar a tela usa `cmd /c cls`, portanto foi feita para o terminal do Windows.

## Arquivos principais

| Arquivo | Função |
| --- | --- |
| `CatFilmes.java` | Inicia o programa. |
| `Menu.java` | Exibe o menu e encaminha a opção escolhida. |
| `FuncoesFilmes.java` | Cadastra e lista os filmes; também mostra a ajuda. |
| `BuscaFilmes.java` | Pesquisa os filmes salvos. |
| `LimparConsole.java` | Limpa a tela do console. |
| `Entrada.java` | Valida as entradas numéricas do usuário. |
| `filmes.txt` | Guarda os registros dos filmes depois do primeiro cadastro. |
