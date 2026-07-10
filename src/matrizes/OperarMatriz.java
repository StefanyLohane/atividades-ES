package matrizes;

public class OperarMatriz {
    public static void main(String[] args) {
        PreencherMatriz p  = new PreencherMatriz();

        System.out.println("Digite 6 números para preencher a matriz: \n");
        p.encherMatriz();

        System.out.println("\t Matriz: ");
        p.mostrarMatriz();

    }
    
}
