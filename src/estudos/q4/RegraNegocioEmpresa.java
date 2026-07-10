package estudos.q4;

public class RegraNegocioEmpresa {
    Empresa[] listaEmpresas = new Empresa[2];
    int posicaoLivre = 0;

    public void cadastrarEmpresa(Empresa empresaNova){
        listaEmpresas[posicaoLivre] = empresaNova;
        posicaoLivre++;
    }

    public Empresa[] listarEmpresa(){
        return listaEmpresas;


    }
    
    
}
