package state.state.Veiculo;


public class BicicletaStrategy implements Strategy{

    private static final int DINAMICA_BICICLETA = 3;
    private static final double PRECO_BASE = 0.5;
    private static final String MODE = "Bicicleta";

    @Override
    public String calculaPrecoCorrida(double ponto_partida, double ponto_destino) {
        double result = ((ponto_destino - ponto_partida) * PRECO_BASE) / DINAMICA_BICICLETA;

        return "Sua escolha foi: " + MODE + " valor corrida: " + result; 
    }
}
