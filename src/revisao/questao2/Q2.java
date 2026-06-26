package revisao.questao2;

public class Q2 {
    public static void main(String[] args) {
        Calculo2 n = new Calculo2();

        System.out.println("Digite os números para somar :");
        n.pegarNumeros();

        System.out.println("A soma dos números é: ");
        System.out.println(n.soma());
    }

}
