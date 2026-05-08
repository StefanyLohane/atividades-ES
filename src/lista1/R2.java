package lista1;

import java.util.Scanner;

public class R2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        int a;
        int b;
        char o;
        int r = 0;

        System.out.println("Digite o primeiro número: ");
        a = scan.nextInt();

        System.out.println("Digite o primeiro número: ");
        b = scan.nextInt();
        
        System.out.println("Qual o tipo de operação? ");
        o = scan.next().charAt(0);

        if (o == '+') {
            r = a + b;
        } 
        else if (o == '-'){
            r = a - b;
        }
        else if(o == '*'){
            r = a * b;
        }
        else if(o == '/'){
            r = a / b;
        }
        else {
            System.out.println("Operação inválida!");
        }

        System.out.println("O resultado de " + a + o + b + " é: " + r);


    }
    
}
