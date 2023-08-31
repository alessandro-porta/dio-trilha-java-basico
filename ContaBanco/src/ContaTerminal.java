import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome:");
        String nome = teclado.next();

        System.out.println("Agencia :");
        String agencia = teclado.next();

        System.out.println("Conta :");
        int numero = teclado.nextInt();

        System.out.println("Saldo :");
        double saldo = teclado.nextDouble();

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+ " já está disonível para saque");

    }
}
