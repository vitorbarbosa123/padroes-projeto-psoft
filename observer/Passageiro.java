

public class Passageiro {
    private String name;
    private String localizacao;

    public Passageiro(String name, String localizacao) {
        this.name = name;
        this.localizacao = localizacao;
    }

    public String getName() {
        return this.name;
    }

    public String getLocalizacao() {
        return this.localizacao;
    }

    public void setNovaLocalizao(String novaLocalizao) {
        this.localizacao = novaLocalizao;
    }
}
