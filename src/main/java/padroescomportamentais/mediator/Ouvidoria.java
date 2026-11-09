package padroescomportamentais.mediator;

public class Ouvidoria {

    private static Ouvidoria instancia = new Ouvidoria();

    private Ouvidoria() {}

    public static Ouvidoria getInstancia() {
        return instancia;
    }

    private String ultimaManifestacao = "";

    public String getUltimaManifestacao() {
        return ultimaManifestacao;
    }

    private void registrar(Pessoa pessoa, String tipo, String setor) {
        this.ultimaManifestacao = pessoa.getNome() + " (" + pessoa.getIdentificacao() + ") registrou " + tipo + " na " + setor;
    }

    public String receberElogioSecretaria(Pessoa pessoa, String mensagem) {
        this.registrar(pessoa, "Elogio", "Secretaria");
        return "A Ouvidoria agradece seu contato.\n"+
                "A Secretaria respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Secretaria.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoSecretaria(Pessoa pessoa, String mensagem) {
        this.registrar(pessoa, "Reclamacao", "Secretaria");
        return "A Ouvidoria agradece seu contato.\n"+
                "A Secretaria respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Secretaria.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoSecretaria(Pessoa pessoa, String mensagem) {
        this.registrar(pessoa, "Sugestao", "Secretaria");
        return "A Ouvidoria agradece seu contato.\n"+
                "A Secretaria respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Secretaria.getInstancia().receberSugestao(mensagem);
    }

    public String receberElogioBiblioteca(Pessoa pessoa, String mensagem) {
        this.registrar(pessoa, "Elogio", "Biblioteca");
        return "A Ouvidoria agradece seu contato.\n"+
                "A Biblioteca respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Biblioteca.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoBiblioteca(Pessoa pessoa, String mensagem) {
        this.registrar(pessoa, "Reclamacao", "Biblioteca");
        return "A Ouvidoria agradece seu contato.\n"+
                "A Biblioteca respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Biblioteca.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoBiblioteca(Pessoa pessoa, String mensagem) {
        this.registrar(pessoa, "Sugestao", "Biblioteca");
        return "A Ouvidoria agradece seu contato.\n"+
                "A Biblioteca respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Biblioteca.getInstancia().receberSugestao(mensagem);
    }

}
