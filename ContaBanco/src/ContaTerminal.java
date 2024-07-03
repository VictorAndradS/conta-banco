import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // TODO: Conhecer e importar a classe Scanner
    
        Scanner scanner = new Scanner(System.in);
        //Solicitar o número da agência

        System.out.println( "Por favor, digite o número da Agência :");
        int numeroAgencia = scanner.nextInt();
        scanner.nextLine();

        //Solicitar o código da agência
        System.out.println("Por favor, digite o número da conta : ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        //Solicitar o nome do cliente
        System.out.println("Por favor, digite o seu nome :");
        String nomeCliente = scanner.nextLine();

        //Saldo da conta
        double saldo = 237.48;

        // Mensagem a ser exibida

        System.out.println("Olá " + nomeCliente + " obrigado por criar sua conta em nosso banco, sua agência é: " + numeroAgencia + " conta " + numeroConta + " e o seu saldo é de R$" +saldo + " já está disponível para saque");

        scanner.close();


        


        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criata
    }
}
