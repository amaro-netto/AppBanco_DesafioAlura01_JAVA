import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        String name = "Amaro Netto";
        String tipoConta = "Corrente";
        double saldo = 3020.99;

        int opcao= 0;

        System.out.println("**********************************");
        System.out.println("\nNome do Cliente:" + name);
        System.out.println("Tipo de Conta:" + tipoConta);
        System.out.println("Saldo Atual: R$" + saldo);
        System.out.println("\n**********************************");



        String menu = """
                
                ** Digite sua opção **
                
                1 - Consultar Saldo
                2 - Transferir Valor
                3 - Receber Valor
                4 - Sair
                
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao !=4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo atualizado: R$" + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor deseja transferir?");
                double valor = leitura.nextDouble();
                if (saldo < valor) {
                    System.out.println("Não há saldo disponivel para transação");
                } else {
                        saldo -= valor;
                        System.out.println("Valor atualizado: R$" + saldo); }

                    } else if (opcao == 3) {
                        System.out.println("Qual valor deseja depositar?");
                        double valor = leitura.nextDouble();
                        saldo += valor;
                        System.out.println("valor atualizado: R$" + saldo);
                    } else if (opcao != 4) {
                        System.out.println("Opção invalida.");
                    }
        }
    }
}

