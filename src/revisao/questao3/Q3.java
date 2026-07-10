package revisao.questao3;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        Juntar juntar = new Juntar();
        
        int [] vetor1 = {2, 5, 8};
        int [] vetor2 = {1, 3, 4};

        int[] resultado = juntar.concatenarVetores(vetor1, vetor2);

        System.err.println(Arrays.toString(resultado));
    }
    
}
