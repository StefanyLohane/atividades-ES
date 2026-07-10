package estudos.q1;

public class Main1 {
    public static void main(String[] args) {
        Metodos1 ordenar = new Metodos1();

        System.out.println("Digite 10 nomes: ");
        ordenar.lerNomes();

        System.out.println("Nomes em ordem alfabética: ");
        ordenar.mostrarNomes();
    }
}
