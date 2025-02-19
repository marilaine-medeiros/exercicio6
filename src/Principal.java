import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int contagem = 1;

        // Ler a idade das 20 pessoas
        // loop - pode usar o for também
        while (contagem <= 20) {
            System.out.println("Digite a idade da pessoa " + contagem + ":");
            int idade = scanner.nextInt();
            soma += idade;
            contagem++;
        }

        // Para exibir a soma das idades
        System.out.println("A soma das idades é: " + soma);

        scanner.close();

    }
}
