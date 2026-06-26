package estudos.q2;

public class Main2 {
    public static void main(String[] args) {
        Metodos2 somar = new Metodos2();

        System.out.println("Digite 10 números: ");
        somar.lerNumeros();

        System.out.println("A soma desses números é: ");
        somar.somar();
    }
}
