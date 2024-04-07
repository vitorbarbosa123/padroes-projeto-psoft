package strategy;

public class CarroStrategy implements Strategy{

    private static final int DINAMICA_CARRO = 1;
    private static final double PRECO_BASE = 2;
    private static final String MODE = "Carro";

    @Override
    public String calculaPrecoCorrida(double ponto_partida, double ponto_destino) {
        double result = ((ponto_destino - ponto_partida) * PRECO_BASE) / DINAMICA_CARRO;

        return "Sua escolha foi: " + MODE + " valor corrida: " + result; 
    }
    
}
