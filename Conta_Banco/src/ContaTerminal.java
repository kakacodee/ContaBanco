import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Insira o número da agencia: ");
        String agencia = scanner.nextLine();
        System.out.println("Insira o nome do cliente: ");
        String nomeCli = scanner.nextLine();
        System.out.println("Insira o saldo da conta: ");
        Double saldo = scanner.nextDouble();
        System.out.println("Olá "+ nomeCli +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque");




    }
}
