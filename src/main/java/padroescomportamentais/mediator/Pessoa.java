package padroescomportamentais.mediator;

public abstract class Pessoa {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String getIdentificacao();

    public String elogiarSecretaria(String mensagem) {
        return Ouvidoria.getInstancia().receberElogioSecretaria(this, mensagem);
    }

    public String reclamarSecretaria(String mensagem) {
        return Ouvidoria.getInstancia().receberReclamacaoSecretaria(this, mensagem);
    }

    public String sugerirSecretaria(String mensagem) {
        return Ouvidoria.getInstancia().receberSugestaoSecretaria(this, mensagem);
    }

    public String elogiarBiblioteca(String mensagem) {
        return Ouvidoria.getInstancia().receberElogioBiblioteca(this, mensagem);
    }

    public String reclamarBiblioteca(String mensagem) {
        return Ouvidoria.getInstancia().receberReclamacaoBiblioteca(this, mensagem);
    }

    public String sugerirBiblioteca(String mensagem) {
        return Ouvidoria.getInstancia().receberSugestaoBiblioteca(this, mensagem);
    }

}
