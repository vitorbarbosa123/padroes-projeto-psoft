package template_method;

public class CarroTemplate extends Uber {

    private static final int DINAMICA_CARRO = 1;
    private static final double PRECO_BASE = 2;
    private static final String MODE = "Carro";

    @Override
    public double calculaValorDistanciaPorPrecoBaseVeiculo(double distanciaCorrida) {
        return distanciaCorrida * PRECO_BASE;
    }

    @Override 
    public double calculaPrecoFinalComDinamica(double valorDistancia) {
        return valorDistancia * DINAMICA_CARRO;
    }
    
}
