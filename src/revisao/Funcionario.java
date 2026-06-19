package revisao;

public class Funcionario {
    String cnpj;
    String nome;
    String telefone;
    
    public Funcionario() {
    }
    public Funcionario(String cnpj, String nome, String telefone) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
