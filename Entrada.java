import java.util.Scanner;

public class Entrada {

    public static int lerInteiro(Scanner input, String pergunta) {
        while (true) {
            System.out.print(pergunta);
            try {
                return Integer.parseInt(input.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Digite um número inteiro válido.");
            }
        }
    }

    public static double lerDecimal(Scanner input, String pergunta) {
        while (true) {
            System.out.print(pergunta);
            try {
                double valor = Double.parseDouble(input.nextLine().trim().replace(',', '.'));
                if (Double.isFinite(valor) && valor >= 0) {
                    return valor;
                }
            } catch (NumberFormatException e) {
                // A mensagem abaixo também cobre números fora do intervalo permitido.
            }
            System.out.println("Digite um valor válido maior ou igual a zero.");
        }
    }
}
