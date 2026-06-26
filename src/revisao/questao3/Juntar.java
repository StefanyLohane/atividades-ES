package revisao.questao3;

public class Juntar {
    public int[] concatenarVetores(int[]vetor1,  int[] vetor2){
        int tamanhoTotal = vetor1.length + vetor2.length;
        int[] vetorConcatenado = new int[tamanhoTotal];

        System.arraycopy(vetor1, 0, vetorConcatenado, 0, vetor1.length);
        System.arraycopy(vetor2, 0, vetorConcatenado, vetor1.length, vetor2.length);

        return vetorConcatenado;
    }
}
