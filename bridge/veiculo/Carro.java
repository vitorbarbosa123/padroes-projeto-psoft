package veiculo;

public class Carro implements Veiculo {
    
    private static final int DINAMICA_CARRO = 1;
    private static final double PRECO_BASE = 2;
    private String MODO = "Carro";

    
    @Override
    public double calculaPrecoCorrida(double valorPercurso) {
        return (valorPercurso / PRECO_BASE) * DINAMICA_CARRO;
    }

    @Override
    public String getVeiculo() {
        return this.MODO;
    }

}
