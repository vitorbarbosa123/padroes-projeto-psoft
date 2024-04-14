package veiculo;

public class Moto implements Veiculo {
    
    private static final int DINAMICA_MOTO = 2;
    private static final double PRECO_BASE = 2.3;
    private String MODO = "Moto";


    @Override
    public double calculaPrecoCorrida(double valorPercurso) {
        return (valorPercurso / PRECO_BASE) * DINAMICA_MOTO;
    }

    @Override
    public String getVeiculo() {
        return this.MODO;
    }

}
