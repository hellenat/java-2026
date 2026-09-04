package basico;

public class Repeticao {
    public static void main(String[] args) {
        // Exemplo de for () crescente
        System.out.println("Lista de 1 até 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " ");
        }
        // Versão crescente descrente
        System.out.println("\n\nLista de dez até um");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        // Versão crescente com while ()
        System.out.println("\n\n\nLista crescente com while()");
        int numero = 1; // inicialização da variável
        while (numero <= 10) {
            System.out.println(numero);
            numero++;
        }
        // Versão decrecente com while ()
        System.out.println("\n\n\nLista decrecente com while()");
        numero = 1; // inicialização da variável
        while (numero >= 1) {
            System.out.println(numero);
            numero--;
        }
    }
}