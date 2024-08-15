import java.util.Scanner;

public class Main { public static void main(String[] args) {
    //Dados do cliente
    String nome = "Luciana Lopes";
    String tipoDeConta = "Conta Corrente";
    double saldoEmConta = 3000.00;

    System.out.println("****************************************");

    System.out.println("Cliente: " + nome);
    System.out.println("Tipo de Conta: " + tipoDeConta);
    System.out.println("Saldo Disponível R$: " + saldoEmConta);

    System.out.println("****************************************");

    // Informação do Menu
    String menu = """
            ** Menu **
            1 - Consultar Saldo
            2 - Transferencia
            3 - Depositar
            4 - Sacar
            5 - Sair
            """;

    // Opção do Menu
    int opcao = 0;
    double transferir = 0;
    double deposito = 0;
    double saque = 0;

    Scanner leitura = new Scanner(System.in);
    while (opcao != 5) {
        System.out.println(menu);
        opcao = leitura.nextInt();

        // Operação consultar saldo em conta.
        if (opcao == 1) {
            System.out.println("Consultar Saldo:");
            System.out.println("O saldo é R$: " + saldoEmConta);
            break;
        }

        // Operação de Transferência
        if (opcao == 2) {
            System.out.println("Valor da Transferência: ");
            transferir = leitura.nextDouble();
            System.out.println("Valor da Transferência R$: " + transferir);
            System.out.println("Saldo Atual R$: " + (saldoEmConta - transferir));

        if (transferir > saldoEmConta) {
            System.out.println("Operação negada, saldo insuficiente");
            break;
        }}

        // Operaçãos de Depósito
        if (opcao == 3) {
            System.out.println("Valor do depósito R$: ");
            deposito = leitura.nextDouble();
            System.out.println("Valor do Depósito R$: " + deposito);
            System.out.println("Saldo Atual R$: " + (saldoEmConta + deposito));
            System.out.println("Depósito realizado com sucesso! ");
            break;
        }

        // Operação de Saque
        if (opcao == 4) {
            System.out.println("Valor do Saque R$: ");
            saque = leitura.nextDouble();
            System.out.println("Valor do Saque R$: " + saque);
            System.out.println("Saldo Atual R$: " + (saldoEmConta - saque));
        if (saque > saldoEmConta) {
            System.out.println("Operação negada, saldo insuficiente");
            break;
        }}
        }

    }
}