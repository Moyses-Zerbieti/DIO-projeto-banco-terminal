import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


            int contaCorreta;
            String agenciaCorreta;
            String nomeCorreto;

        System.out.println("CADASTRO DE CONTA");


            System.out.print("Digite seu nome completo: ");
            nomeCorreto = scanner.nextLine().trim();

            System.out.print("Digite o número da Agência: ");
            agenciaCorreta = scanner.nextLine().trim();


            System.out.print("Digite o número da conta: ");
            contaCorreta = scanner.nextInt();
            scanner.nextLine();

        System.out.println("CONTA CADASTRADA COM SUCESSO!");

        System.out.println("LOGIN NA CONTA");
            System.out.print("Numero da conta: ");
            int conta = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Número da agência: ");
            String agencia = scanner.nextLine().trim();
        
            System.out.print("Nome completo do Cliente: ");
            String nome = scanner.nextLine().trim();

        System.out.println("Dados Informados");
        System.out.println("Nome: " + nome);
        System.out.println("Agência: " + agencia);
        System.out.println("Conta " + conta);

            if(nome.equals(nomeCorreto) && agencia.equals(agenciaCorreta) && conta == contaCorreta){
            System.out.println("Ola " + nome +", bem-vindo!");
            System.out.println("Faça um depósito para ter o valor disponível para saque!");

            }else{
            System.out.println("Os dados inseridos não correspondem a uma conta existente no sistema");
            }
            scanner.close();
    }
}