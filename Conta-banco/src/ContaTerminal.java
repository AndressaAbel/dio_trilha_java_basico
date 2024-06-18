
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        //Exibir as mensagens para o nosso usuário
        //Obter pela Scanner os valores digitados no terminal 
        //Exibir a mensagem conta criada

        Scanner scanner = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuário
        System.out.println("Olá, seja bem vindo ao banco SkyBank.");

        System.out.println("Por favor insira seu nome:");
        String nome = scanner.nextLine();

        System.err.println("Por favor, insira sobrenome:");
        String sobrenome =scanner.nextLine();

        System.out.println("Agora, para verificarmos seu saldo, insira o numero da Agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, insira o número da conta:");
        int numeroConta = scanner.nextInt();
        //Para numeros, utilizar inteiros que não prequerem casas decimais

        System.out.println("Por favor, insira o saldo inicial:");
        double saldo = scanner.nextDouble();
        // Usei nextDouble() para ler o saldo inicial como um valor numérico com frações decimais.

        System.out.println("\nOlá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }

}
