package veiculo;

public class Bicicleta implements Veiculo {
    private static final int DINAMICA_BICICLETA = 3;
    private static final double PRECO_BASE = 0.2;
    private String MODO = "Bicicleta";


    @Override
    public double calculaPrecoCorrida(double valorPercurso) {
        return (valorPercurso / PRECO_BASE) * DINAMICA_BICICLETA;
    }

    @Override
    public String getVeiculo() {
        return this.MODO;
    }
}
