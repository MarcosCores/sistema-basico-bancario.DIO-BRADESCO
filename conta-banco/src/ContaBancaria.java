import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        System.out.println("Por favor, digite o nome do Cliente!");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial!");
        double saldo = scanner.nextDouble();

        String mensagem = "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " 
        + agencia + ", conta " + numero + " e seu saldo de R$: " + saldo + " já está disponível para saque.";

        System.out.println(mensagem);

        scanner.close();
    }
}
