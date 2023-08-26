import java.util.Scanner;

public class BancoTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Pedir ao usuario seus Dados
        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite a Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Digite a agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Valores digitados:");
        System.out.println("Conta: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Saldo: " + saldo);

        scanner.close();

        // Utilizando o método concat para a mensagem de boas-vindas
        String mensagemBoasVindas = "Olá: ".concat(nomeCliente)
                .concat(", Seja bem vindo ao nosso banco, seus dados são: Agencia: ")
                .concat(agencia)
                .concat(", Conta: ")
                .concat(String.valueOf(numero))
                .concat(" e seu saldo de: ")
                .concat(String.format("%.2f", saldo))
                .concat(" já está disponivel para saque");

        System.out.println(mensagemBoasVindas);
    }

}
