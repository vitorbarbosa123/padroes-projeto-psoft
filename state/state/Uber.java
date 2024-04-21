package state.state;
import state.state.State.State;
import state.state.Veiculo.CarroStrategy;
import state.state.Veiculo.Strategy;

/*
 * O padrão de projeto state permite que uma classe tenha diversos comportamentos sem que um funcionamento impacte no outro. 
 * Esse padrão implementa uma ideia de Estados. Cada estado que uma classe pode assumir deve ser isolado em uma outra classe. 
 * Cada classe de estado conhece o outro estado que a classe pai pode assumir, criando um sistema de pipeline (estado1 -> estado2 -> estado3 -> ...)
 * A classe pai não precisa englobar todos os estados, mas precisa partir de um para alcançar os outros.
 * Cada classe de estado, ao iniciar precisa modificar o próprio estado, apontando para um outro estado. Em seguida, ela pode executar comportamentos
 * especificos. O ciclo é repetido até que o estado alcance uma classe que não realiza mais nada.
 * @author Vitor Barbosa
 */
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
