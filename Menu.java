import java.util.Scanner;

public class Menu {

    public static void TituloeMenu() {
        Scanner imput = new Scanner(System.in);

        int opcoes;
        FuncoesFilmes funcoes = new FuncoesFilmes();

        do {
            System.out.println(" ");
            System.out.println("=============");
            System.out.println("==CatFilmes==");
            System.out.println("=============");
            System.out.println(" ");

            System.out.println("1 - Cadastrar Filmes");
            System.out.println("2 - Listar Filmes");
            System.out.println("3 - Pesquisar Filmes");
            System.out.println("4 - Ajuda");
            System.out.println("0 - Sair");
            opcoes = Entrada.lerInteiro(imput, "Digite sua opcao: ");

            switch (opcoes) {
                case 0:
                    LimparConsole.LimparCmd();
                    funcoes.case0();
                    break;
                case 1:
                    LimparConsole.LimparCmd();
                    funcoes.case1(imput);
                    break;
                case 2:
                    LimparConsole.LimparCmd();
                    funcoes.case2(imput);
                    break;
                case 3:
                    LimparConsole.LimparCmd();
                    funcoes.case3(imput);
                    break;
                case 4:
                    LimparConsole.LimparCmd();
                    funcoes.case4(imput);
                    break;
                default:
                    break;
            }

            if (opcoes < 0 || opcoes > 4) {
                LimparConsole.LimparCmd();
                System.out.println("Opção inválida, tente novamente");
                continue;
            }
        } while (opcoes != 0);

        // Fecha a entrada somente depois que o usuario sai do menu.
        imput.close();
    }
}

