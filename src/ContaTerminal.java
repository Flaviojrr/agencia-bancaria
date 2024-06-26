import java.util.Scanner;

public class ContaTerminal {
    public static int numero;
    public static String agencia;
    public static String nomeCliente;
    public static double saldo;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        numero=sc.nextInt();
        System.out.println("Por favor, digite o codigo da Agência !");
        agencia=sc.next();
        System.out.println("Por favor, digite o nome do cliente !");
        sc.nextLine();
        nomeCliente=sc.nextLine();
        System.out.println("Por favor, digite o saldo da conta!");
        saldo=sc.nextDouble();
        System.out.println("Olá "+ nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia+", conta "+ numero+" e seu saldo "+ saldo+" já está disponível para saque.");
    }
}
