package state.state;
import state.state.State.State;
import state.state.Veiculo.CarroStrategy;
import state.state.Veiculo.Strategy;

public class Uber {

    Corrida corrida;

    Strategy strategy;

    public Uber(Corrida corrida, Strategy strategy) {
        this.corrida = corrida;
        this.strategy = strategy;
    }

    public State initCorrida() {
        return this.corrida.getState();
    }

    public String initCorridaToString() {
        return initCorrida().statusCorrida();
    }

    public String calculaPreco(double ponto_partida, double ponto_destino) {
        return this.strategy.calculaPrecoCorrida(ponto_partida, ponto_destino);
    }

    public static void main(String args[]) {
        Corrida corrida = new Corrida();
        double ponto_destino = 1.2;
        double ponto_partida = 0.5;
     
        Uber contexto = new Uber(corrida, new CarroStrategy());
        System.out.println(contexto.initCorridaToString());
        System.out.println(contexto.initCorridaToString());
        System.out.println(contexto.initCorridaToString());
        System.out.println(contexto.initCorridaToString());
        System.out.println(contexto.calculaPreco(ponto_partida, ponto_destino));
    }


    
}
