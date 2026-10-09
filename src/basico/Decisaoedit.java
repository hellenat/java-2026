package basico;

import java.util.Scanner;

public class Decisaoedit {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.int);
        System.out.println("Digite uma nota de 0 a 10: ");
        int nota = entrada.nextInt();

        /// Exemplo de if e else
        if (nota >= 7) {
            System.out.println("Passou direto!");
        } else if (nota >= 4 && nota < 7) {
            System.out.println("EXAME!");
        }
        else {
            System.out.println("Reprovou!");
        }
    }
}
