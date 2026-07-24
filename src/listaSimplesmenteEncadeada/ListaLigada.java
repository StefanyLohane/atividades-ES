package listaSimplesmenteEncadeada;

public class ListaLigada {
    private Celula primeira;
    private Celula ultima;
    
    public ListaLigada() {
    }
    public ListaLigada(Celula primeira, Celula ultima) {
        this.primeira = primeira;
        this.ultima = ultima;
    }

    public Celula getPrimeira() {
        return primeira;
    }
    public void setPrimeira(Celula primeira) {
        this.primeira = primeira;
    }
    public Celula getUltima() {
        return ultima;
    }
    public void setUltima(Celula ultima) {
        this.ultima = ultima;
    }

    public void inserirNoFim(int valor){
        Celula novaCelula = new Celula(valor);
        if (primeira == null) {
            primeira = novaCelula;
            ultima = novaCelula;
        }
        else {
             ultima.setProxima(novaCelula);
             ultima = novaCelula;

        }
    }
    
    public void inserirNoComeco(int valor){
        Celula novaCelula = new Celula(valor);
        if (primeira == null) {
            primeira = novaCelula;
            ultima = novaCelula;
        }
        else {
             novaCelula.setProxima(primeira);
             primeira = novaCelula;
        }
    }
    
    public void inserirEmQualquerPosicao(int valor){
        Celula novaCelula = new Celula(valor);
        if (primeira == null) {
            primeira = novaCelula;
            ultima = novaCelula;
        }
        else {
            
        }
    }
}