package padroescomportamentais.mediator;

public class Biblioteca implements Setor {

    private static Biblioteca instancia = new Biblioteca();

    private Biblioteca() {}

    public static Biblioteca getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "A Biblioteca vai procurar melhorar o serviço da reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "A Biblioteca agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "A Biblioteca vai analisar a sugestão: " + mensagem;
    }
}
