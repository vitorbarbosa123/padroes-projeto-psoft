package template_method;

public class BicicletaTemplate extends Uber {

    private static final int DINAMICA_BICICLETA = 3;
    private static final double PRECO_BASE = 0.5;
    private static final String MODE = "Bicicleta";

    @Override
    public double calculaValorDistanciaPorPrecoBaseVeiculo(double distanciaCorrida) {
        return distanciaCorrida * PRECO_BASE;
    }

    @Override 
    public double calculaPrecoFinalComDinamica(double valorDistancia) {
        return valorDistancia * DINAMICA_BICICLETA;
    }
}
