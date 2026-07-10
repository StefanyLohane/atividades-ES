package revisao.questao4;

public class RegraNegocioEmpresa {

    Empresa[] empresas = new Empresa[10];
    int posicaoLivre = 0;

    public void cadastrarEmpresa(Empresa empresa) {

        empresas[posicaoLivre] = empresa;
        posicaoLivre++;

    }

    public Empresa[] listarEmpresa() {
        return empresas;

    }

}
