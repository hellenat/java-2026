package basico;

public class Decisao {
        public static void main(String[] args) {
            int nota = 7;

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
