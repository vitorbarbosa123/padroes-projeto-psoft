package state.state.State;

import state.state.Corrida;

public abstract class State {
    Corrida corrida;

    State(Corrida corrida) {
        this.corrida = corrida;
    }

    public abstract String statusCorrida();
    
}
