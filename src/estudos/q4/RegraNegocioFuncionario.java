package estudos.q4;

public class RegraNegocioFuncionario {
    Funcionario[] listaFuncionarios = new Funcionario[2];
    int posicaoLivre = 0;

    
    public void cadastrarFuncionario(Funcionario funcionarioNovo){
        listaFuncionarios[posicaoLivre] = funcionarioNovo;
        posicaoLivre++;

    }

    public Funcionario[] listarFuncionario(){
        return listaFuncionarios;
    }

    public void adicionarPosicao(Funcionario funcionarioNovo, int posicao){
        listaFuncionarios[posicao] = funcionarioNovo;

    }

    public void removerPosicao(int posicao){
        listaFuncionarios[posicao] = null;
        
    }
    
    public Funcionario procurar(String nome){
        for(int i = 0; i < listaFuncionarios.length; i++){
            if (listaFuncionarios[i].getNome().equals(nome)){
                return listaFuncionarios[i];
            }
        }
            return null;
    
    }

    public void aumentarVetor(){
        Funcionario[] novoVetor = new Funcionario[listaFuncionarios.length * 2];
        for(int i = 0; i < listaFuncionarios.length; i++){
            novoVetor[i] = listaFuncionarios[i];
        }

    listaFuncionarios = novoVetor;

    
    }
}
