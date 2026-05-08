package lista2;
import java.util.Scanner;

public class Quatro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int s;
        int t;
        int v;

        System.out.println("Digite a distância: ");
        s = scan.nextInt();
        
        System.out.println("Digite o tempo: ");
        t = scan.nextInt();

        v = s / t;
        
        System.out.println("A velocidade média é de " + v);
    }
    
}
