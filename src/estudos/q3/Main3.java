package estudos.q3;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        Metodos3 juntar = new Metodos3();
        int[] vetorJunto;

        System.out.println("Digite  para encher os vetores: ");
        juntar.encherVetores();

        System.out.println("Vetor junto: ");

        vetorJunto = juntar.juntarVetores();
        System.out.println(Arrays.toString(vetorJunto));
        
    }
    
}
