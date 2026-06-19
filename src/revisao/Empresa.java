package revisao;

public class Empresa {
    String cpf;
    String nome;
    String rg;
    String telefone;

    public Empresa() {
    }
    public Empresa(String cpf, String nome, String rg, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.rg = rg;
        this.telefone = telefone;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
