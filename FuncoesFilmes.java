import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FuncoesFilmes {

    public void case0() {
        System.out.println("Sistema finalizado!");
    }

    public void case1(Scanner imput) {
        //=====================================================//
        //Variaveis nums
        int ano_filmes;
        int classificacao_Filmes;
        double aluguel_valor_filme = 0.00;
        //=====================================================//

        //=====================================================//
        //Strings Variaveis
        String sinopose;
        String cadastros_filmes;
        String categoria_filmes;
        String atores_filmes;
        String aluguelInput;
        String ano_maior_filme;
        //=====================================================//

        LimparConsole.LimparCmd();
        System.out.println("Fase 1");
        System.out.print("Digite o nome do filme: ");
        cadastros_filmes = imput.nextLine();

        LimparConsole.LimparCmd();

        System.out.println("Fase 2");

        System.out.print("Categoria: ");
        categoria_filmes = imput.nextLine();

        LimparConsole.LimparCmd();

        System.out.println("Fase 3");

        System.out.print("Ator: ");
        atores_filmes = imput.nextLine();

        LimparConsole.LimparCmd();

        System.out.println("Fase 4");
        System.out.print("Ano de lancamento: ");
        ano_filmes = imput.nextInt();
        imput.nextLine();

        if (ano_filmes > 2000) {
            ano_maior_filme = "Filme atual";
        } else {
            ano_maior_filme = "Filme Clasico";
        }

        LimparConsole.LimparCmd();

        System.out.println("Fase 5");

        System.out.print("Sinopose: ");
        sinopose = imput.nextLine();

        LimparConsole.LimparCmd();

        System.out.println("Fase 6");
        System.out.print("Classificacao: ");
        classificacao_Filmes = imput.nextInt();
        imput.nextLine();

        LimparConsole.LimparCmd();

        System.out.println("Fase 7");
        while (true) {
            System.out.print("Filme Alugado Sim ou Nao: ");
            aluguelInput = imput.nextLine();
            if (aluguelInput.equalsIgnoreCase("Sim")) {
                System.out.print("Digite o valor do aluguel: ");
                aluguel_valor_filme = imput.nextDouble();
                imput.nextLine();

                break;
            } else if (aluguelInput.equalsIgnoreCase("Nao")) {
                break;
            } else {
                System.out.println("Entrada inválida. Por favor, digite Sim ou Nao.");
            }
        }

        LimparConsole.LimparCmd();

        System.out.println("=================");
        System.out.println("Dados Cadastrados");
        System.out.println("=================");

        System.out.println("Filmes: " + cadastros_filmes);
        System.out.println("Categoria: " + categoria_filmes);
        System.out.println("Atores:" + atores_filmes);
        System.out.println("Ano: " + ano_filmes);
        System.out.println("Sinopose: " + sinopose);
        System.out.println("Classificacao idade: " + classificacao_Filmes);
        System.out.println("Aluguel:" + aluguelInput);
        System.out.println("Valor Aluguel: " + aluguel_valor_filme);

        try (
            FileWriter bancoPesquisa = new FileWriter("filmes.txt", true);
            PrintWriter escrever = new PrintWriter(bancoPesquisa)
        ) {
            escrever.println(
                " | Nome: " +
                    cadastros_filmes +
                    " | Categoria:" +
                    categoria_filmes +
                    " |  Atores: " +
                    atores_filmes +
                    " | Ano: " +
                    ano_filmes +
                    " | Tipo de filme: " +
                    ano_maior_filme +
                    " | Sinoposi: " +
                    sinopose +
                    " | Classificacao: +" +
                    classificacao_Filmes +
                    " | Aluguel: " +
                    aluguelInput +
                    " | Valor Aluguel: " +
                    aluguel_valor_filme
            );

            System.out.println("=========================");
            System.out.println("Dados Salvos com sucesso!");
            System.out.println("=========================");
        } catch (IOException e) {
            System.out.println("Erro ao salvar no arquivo: " + e.getMessage());
        }

        System.out.println("Pressione Enter para proseguir...");
        imput.nextLine();
    }

    public void case2(Scanner imput) {
        File arquivo = new File("filmes.txt");
        int quantidade = 0;

        System.out.println("========================");
        System.out.println("   FILMES CADASTRADOS");
        System.out.println("========================");

        try (Scanner scanner = new Scanner(arquivo, "UTF-8")) {
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine().trim();
                if (linha.isEmpty()) {
                    continue;
                }

                quantidade++;
                System.out.println();
                System.out.println("Filme " + quantidade);
                System.out.println("------------------------");
                for (String campo : linha.split("\\|")) {
                    campo = campo.trim();
                    if (!campo.isEmpty()) {
                        System.out.println(campo);
                    }
                }
            }
        } catch (FileNotFoundException e) {}

        if (quantidade == 0) {
            System.out.println("Nenhum filme cadastrado ainda.");
        }

        System.out.println();
        System.out.println("Total de filmes: " + quantidade);
        System.out.print("Pressione Enter para voltar ao menu...");
        imput.nextLine();
    }

    public void case3(Scanner imput) {
        LimparConsole.LimparCmd();
        BuscaFilmes.BuscaFilmess(imput);
    }

    public void case4(Scanner imput) {
        LimparConsole.LimparCmd();

        System.out.println("==============");
        System.out.println("Menu de Ajuda");
        System.out.println("==============");

        System.out.println("1 - Cadastrar Filmes: Permite cadastrar novos filmes no sistema.");
        System.out.println("2 - Listar Filmes: Exibe a lista de filmes cadastrados.");
        System.out.println("3 - Pesquisar Filmes: Permite pesquisar filmes por nome ou categoria.");
        System.out.println("4 - Ajuda: Exibe este menu de ajuda.");
        System.out.println("0 - Sair: Encerra o programa.");

        System.out.print("Presione qualquer tecla...");
        imput.nextLine();
        LimparConsole.LimparCmd();
    }
}

