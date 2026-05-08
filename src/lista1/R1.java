import java.util.Scanner;

public class R1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        int r;
        int i = 1;

        System.out.println("Digite o número para a tabuada: ");
        n = scan.nextInt();

        while (i<=10) {
            r = n*i;
            System.out.println(i + " x " + n  + "=" + r);
            i = i+1;
        }
    }
    
}
