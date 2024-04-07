package strategy;

public class MotoStrategy implements Strategy {
    
    private static final int DINAMICA_MOTO = 2;
    private static final double PRECO_BASE = 2.3;
    private static final String MODE = "Bicicleta";

    @Override
    public String calculaPrecoCorrida(double ponto_partida, double ponto_destino) {
        double result = ((ponto_destino - ponto_partida) * PRECO_BASE) / DINAMICA_MOTO;

        return "Sua escolha foi: " + MODE + " valor corrida: " + result; 

    }

}
