package state.state;
import state.state.State.State;

public class Uber {

    Corrida corrida;

    public Uber(Corrida corrida) {
        this.corrida = corrida;
    }

    public State initCorrida() {
        return this.corrida.getState();
    }

    public String initCorridaToString() {
        return initCorrida().statusCorrida();
    }

    public static void main(String args[]) {
        Corrida corrida = new Corrida();
        Uber contexto = new Uber(corrida);
        System.out.println(contexto.initCorridaToString());
        System.out.println(contexto.initCorridaToString());
        System.out.println(contexto.initCorridaToString());
        System.out.println(contexto.initCorridaToString());
    }


    
}
