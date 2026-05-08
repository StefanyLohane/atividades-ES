package lista1;

import java.util.Scanner;

public class R6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double valor = 12.25, sal;
        int horas;

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        horas = scan.nextInt();

        sal = horas * valor;

        System.out.println("Seu salário é R$ " + sal + " no total!");
    }
    
}
