package estudos.q1;

import java.util.Arrays;
import java.util.Scanner;

public class Metodos1 {
    Scanner scan = new Scanner(System.in);
    String[] nomes = new String[10];

    public void lerNomes(){
        for(int i = 0; i < nomes.length; i++){
            nomes[i] = scan.nextLine();
        }
        Arrays.sort(nomes);
    }

    public void mostrarNomes(){
        System.out.println(Arrays.toString(nomes));
    }

    
}
