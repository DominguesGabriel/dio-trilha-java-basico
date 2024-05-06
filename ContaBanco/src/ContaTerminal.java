import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner (System.in);
        String nome;
        String agencia;
        int numero;
        double saldo;
        numero = lerNumero(in);
        agencia = lerAgencia(in);
        nome = lerNome(in);
        saldo = lerSaldo(in);
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ",  conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }

    public static int lerNumero(Scanner in){
        int numero;
        System.out.println("Digite o número da sua conta");
        numero = in.nextInt();
        return numero;
    }

    public static String lerNome(Scanner in){
        String nome;
        System.out.println("Digite seu nome");
        nome = in.next();
        return nome;
    }

    public static String lerAgencia(Scanner in){
        String agencia;
        System.out.println("Digite a agência de sua conta bancária");
        agencia = in.next();
        return agencia;
    }

    public static double lerSaldo(Scanner in){
        double saldo;
        System.out.println("Digite seu saldo");
        saldo = in.nextDouble();
        return saldo;
    }

}
