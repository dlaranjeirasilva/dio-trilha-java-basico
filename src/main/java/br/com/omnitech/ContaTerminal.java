package br.com.omnitech;

import br.com.omnitech.contabanco.ContaCliente;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência:");
        String agencia = sc.nextLine();
        System.out.println("Por favor, digite o número da conta:");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = sc.nextLine();
        System.out.println("Por favor, digite o saldo da conta:");
        double saldo = sc.nextDouble();

        ContaCliente novaConta = new ContaCliente(numero, agencia, nomeCliente, saldo);

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d, e seu saldo R$ %.2f já está disponível para saque."
                , novaConta.getNomeCliente(), novaConta.getAgencia(), novaConta.getNumero(), novaConta.getSaldo());
    }
}