package padroescomportamentais.mediator;

public class Professor extends Pessoa {

    private int siape;

    public int getSiape() {
        return siape;
    }

    public void setSiape(int siape) {
        this.siape = siape;
    }

    public String getIdentificacao() {
        return "SIAPE " + siape;
    }
}
