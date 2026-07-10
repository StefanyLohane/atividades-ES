package revisao.questao1;

public class Q1 {
   public static void main(String[] args) {
      Ordema1 ordem = new Ordema1();
      
      System.out.println("Digite 10 nomes para ordenar: ");
      ordem.ordenar();

      System.out.println("Nomes em ordem alfabética: ");
      ordem.ordenados();
   }
}
