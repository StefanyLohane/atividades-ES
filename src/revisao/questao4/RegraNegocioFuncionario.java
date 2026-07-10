package revisao.questao4;

public class RegraNegocioFuncionario {

    Funcionario[] funcionarios = new Funcionario[10];
    int posicaolivre = 0;

    public void cadastrarFuncionario(Funcionario funcionario) {

        funcionarios[posicaolivre] = funcionario;
        posicaolivre++;

    }

    public Funcionario[] listarFuncionario() {
        return funcionarios;

    }

    public void adicionarPorPosicao(Funcionario funcionario, int posicao){
    funcionarios[posicao] = funcionario;

   }

   public void removerPorPosicao(int posicao){
    funcionarios[posicao] = null;

    }

    public Funcionario procurar(String nome){

    for(int i = 0; i < posicaolivre; i++){

        if(funcionarios[i].getNome().equals(nome)){
            return funcionarios[i];
        }
    }
    return null;
    }

    public void aumentarVetor(){
    Funcionario[] novoVetor = new Funcionario[20];
    for(int i = 0; i < funcionarios.length; i++){

        novoVetor[i] = funcionarios[i];

    }
    funcionarios = novoVetor;
    }

}
