import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta!");
        int numeroDaConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();
        
        System.out.println("Por favor, digite seu Nome e Sobrenome!");
        String nomeClient = scanner.nextLine();
        
        System.out.println("Por favor, digite o valor do Saldo!");
        double saldo = scanner.nextDouble();
        

        String mensagemDeCriacao = "Olá "+ nomeClient +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroDaConta + " e seu saldo " + saldo + " já está disponível para saque";

        System.out.println(mensagemDeCriacao);
    }
}
