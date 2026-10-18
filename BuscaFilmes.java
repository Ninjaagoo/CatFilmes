import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BuscaFilmes {

    static void BuscaFilmess(Scanner imput) {
        //==================
        //Variaveis inteiras

        int repeticao_pesquisa;

        //==================

        //Variaveis String

        String busca;
        String linha;

        //==================

        //Boolean

        boolean encontrou;

        //=========================

        do {
            LimparConsole.LimparCmd();

            System.out.println("================");
            System.out.println("Sistema de Busca");
            System.out.println("================");
            System.out.println(" ");

            System.out.print("Qual filme esta a procura hoje: ");
            busca = imput.nextLine();

            File bancoPesquisa = new File("filmes.txt");

            try (Scanner leitor = new Scanner(bancoPesquisa)) {
                encontrou = false;

                while (leitor.hasNextLine()) {
                    linha = leitor.nextLine();

                    if (linha.toLowerCase().contains(busca.toLowerCase())) {
                        System.out.println("Filme encontrado: " + linha);
                        encontrou = true;
                    }
                }

                if (!encontrou) {
                    System.out.println("Nenhum filme com o nome '" + busca + "' foi encontrado.");
                }
            } catch (FileNotFoundException e) {
                System.out.println("O arquivo filmes.txt ainda não existe.");
            }

            do {
                repeticao_pesquisa = Entrada.lerInteiro(
                    imput,
                    "Deseja fazer outra busca? Digite 1 para sim e 0 para não: "
                );
                if (repeticao_pesquisa != 0 && repeticao_pesquisa != 1) {
                    System.out.println("Digite 1 ou 0.");
                }
            } while (repeticao_pesquisa != 0 && repeticao_pesquisa != 1);
        } while (repeticao_pesquisa != 0);
    }
}

