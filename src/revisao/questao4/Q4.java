package revisao.questao4;

public class Q4 {
    public static void main(String[] args) {

        RegraNegocioEmpresa rne = new RegraNegocioEmpresa();
        RegraNegocioFuncionario rnf = new RegraNegocioFuncionario();

        Empresa empresa = new Empresa("009988776655", "MITC", "(75) 90178-9857");

        Funcionario funcionario = new Funcionario("12345678900", "Lohane", "1234567", "(75) 98765-8906");

        rne.cadastrarEmpresa(empresa);
        rnf.cadastrarFuncionario(funcionario);

        System.out.println("--- EMPRESA ---");
        System.out.println(rne.listarEmpresa()[0].getNome());

        System.out.println("\n--- FUNCIONARIO ---");
        System.out.println(rnf.listarFuncionario()[0].getNome());

    }

}
