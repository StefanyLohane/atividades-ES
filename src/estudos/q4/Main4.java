package estudos.q4;

public class Main4 {
    public static void main(String[] args) {
        RegraNegocioEmpresa rne = new RegraNegocioEmpresa();
        RegraNegocioFuncionario rnf = new RegraNegocioFuncionario();

        Funcionario funcionario1 = new Funcionario("516.098.789-09", "Stefany", "57.987.78-09", "(75)98877-0962");
        Empresa empresa1 = new Empresa("09876553", "SL", "(75) 98876-0935");

        rne.cadastrarEmpresa(empresa1);
        rnf.cadastrarFuncionario(funcionario1);

        System.out.println("Cadastro salvo!");

        System.out.println(rnf.listarFuncionario()[0].getNome());
        System.out.println(rnf.listarFuncionario()[0].getCpf());
        System.out.println(rnf.listarFuncionario()[0].getRg());
        System.out.println(rnf.listarFuncionario()[0].getTelefone());

        System.out.println(rne.listarEmpresa()[0].getNome());
        System.out.println(rne.listarEmpresa()[0].getCnpj());
        System.out.println(rne.listarEmpresa()[0].getTelefone());

    }
    
}
