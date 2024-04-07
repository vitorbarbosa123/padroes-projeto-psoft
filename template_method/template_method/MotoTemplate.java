package template_method;

public class MotoTemplate extends Uber {
    
    private static final int DINAMICA_MOTO = 2;
    private static final double PRECO_BASE = 2.3;
    private static final String MODE = "Bicicleta";

    @Override
    public double calculaValorDistanciaPorPrecoBaseVeiculo(double distanciaCorrida) {
        return distanciaCorrida * PRECO_BASE;
    }

    @Override 
    public double calculaPrecoFinalComDinamica(double valorDistancia) {
        return valorDistancia * DINAMICA_MOTO;
    }

}
