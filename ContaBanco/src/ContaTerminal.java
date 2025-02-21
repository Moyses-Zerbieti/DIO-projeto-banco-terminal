import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Por favor, digite o número da conta!");
        int conta = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Agora digite o número da Agência");
        String agencia = scanner.nextLine();
        
        System.out.println("Qual o nome do cliente?");
        String nome = scanner.nextLine();

        if (conta == 6867 && nome.equals("Moyses Zerbieti") && agencia.equals("876-9")){
            
            double saldo = 980.70;
            System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + " , e seu saldo é de: " + saldo + " já está disponível para saque");
        
        }else{
            System.out.println("Sua conta não foi cadastrada!");
        }

        scanner.close();
    }
}