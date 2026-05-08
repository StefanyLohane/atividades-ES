package lista2;
import java.util.Scanner;

public class Dois {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ano_atual;
        int ano_nasc;
        int idade;

        System.out.println("Digite o ano atual: ");
        ano_atual = scan.nextInt();

        System.out.println("Digite o ano de nacimento: ");
        ano_nasc = scan.nextInt();

        idade = ano_atual - ano_nasc;

        System.out.println("Você tem " + idade +" anos");
    }
    
}
