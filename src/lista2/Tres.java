import java.util.Scanner;

public class Tres {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1;
        int n2;
        int n3;
        int media;

        System.out.println("Digite a primeira nota: ");
        n1 = scan.nextInt();

        System.out.println("Digite a segunda nota: ");
        n2 = scan.nextInt();

        System.out.println("Digite a terceira nota: ");
        n3 = scan.nextInt();

        media = (n1+n2+n3)/3;

        System.out.println("A sua média é: " + media);

        if (media>=7) {
            System.out.println("Você foi aprovado!");

        } 
        
        if (media >=5 && media <7) {
            System.out.println("Você está de recuperação!");

        }

        if (media <5) {
            System.out.println("Você foi reprovado!");

        }


    }
    
}
