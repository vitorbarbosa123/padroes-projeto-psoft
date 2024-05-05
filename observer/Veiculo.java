

public class Veiculo {
    private String type;
    private double valor_base;
    private String motorista_name;
    private String posicao;


    public Veiculo(String type, double valor_base, String motorista_name, String posicao) {
        this.type = type;
        this.valor_base = valor_base;
        this.motorista_name = motorista_name;
        this.posicao = posicao;
    }

    public String getVeiculo() {
        return "Motorista: " + this.motorista_name + " - " + this.type; 
    }

    public void setPosicao(String novaPosicao) {
        this.posicao = novaPosicao;
    }

    public String getPosicao() {
        return this.posicao;
    }

    public String corridaDisponivel(String passageiro_name, String local, double valor) {
        return "Corrida disponivel: " + "\n" + 
                getVeiculo() + "\n" +
               "passageiro: " + passageiro_name + "\n" +
               "local: " + local + "\n" +
               "valor: " + valor * valor_base;
    }
}
