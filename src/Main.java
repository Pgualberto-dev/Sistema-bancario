import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Variaveis de validação guys
        String nome ;
        String senha ;
//login
     for (int tentativa = 0;tentativa<=3; tentativa++) {

         System.out.println("Usuario: ");
         nome = sc.next();
         System.out.println("Senha: ");
         senha = sc.next();

         if (!nome.equals("adim") || !senha.equals("1319")) {

             System.out.println("Usuario ou senha incorretos!");
             System.out.println("TENTE NOVAMENTE");
             System.out.println("tentativa " + tentativa + " de 3");
         } else {

             System.out.println("LOGIN BEM SUCEDIDO");
             System.out.println("   Bem-Vindo   ");
             break;
         }

         int opcao;
         do {

             try {
                 System.out.println("           OPERAÇÕES                  ");
                 System.out.println("  digite o numero da operação         ");
                 System.out.println("          1º Saldo                    ");
                 System.out.println("        2º Deposito                   ");
                 System.out.println("          3º Sacar                     ");
                 System.out.println("          4º SAIR                    ");

                 opcao = sc.nextInt();


             } catch (InputMismatchException e){

                 System.out.println("   Entrada invalida    ");
                 System.out.println("Digite o valor de 1 à 4");
                 sc.nextLine();
                 opcao = 0;
             }



             switch (opcao){

                 case 1:
                     System.out.println("SALDO");
                     System.out.println(" R$ 2,000");
                     break;
                 case 2:
                     System.out.println(" Deposito ");
                     System.out.println("Digite um valor");
                     double valorDesposito = sc.nextDouble();
                     System.out.println("Valor depositado R$" + valorDesposito);
                     break;
                 case 3:
                     for (int saque = 0;saque <=3; saque++) {
                         System.out.println("     SACAR     ");
                         System.out.println("Digite um valor");
                         double valorSaque = sc.nextDouble();
                         double saldoAtual = 2000;
                         if (valorSaque <= 0 || valorSaque > saldoAtual) {
                             System.out.println("Impossibilitado de executar");
                         } else {
                             System.out.println("SAQUE");
                             System.out.println("Valor do saque R$" + valorSaque);
                             break;
                         }
                     }
                     break;

                 case 4:
                     System.out.println("OBROGADO PELA SUA CONFIANÇA");
                     System.out.println("         saindo            ");







             }


         } while (opcao != 4);


     }
    }
}
