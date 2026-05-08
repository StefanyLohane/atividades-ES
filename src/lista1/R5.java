import java.util.Scanner;

public class R5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;

        System.out.println("Digite um número: ");
        n = scan.nextInt();

        if (n%2 == 0) {
            System.out.println("O número é par!");
        }
        else if(n%2 == 1){
            System.out.println("O número é ímpar!");
        }

        // Primo: n/n e n/1 só, elimina pares com /2

        if((n==2) || (n%n == 1) || (n%1 == n)){
            System.out.println("Primo!");
        }
        else if ((n%2 == 0) || (n%3 == 0) || (n%5 == 0) && (n != 2)){
            System.out.println("Não é primo!");
        }
        else{
            System.out.println("Primo!");
        }




    }
    
}
